package org.example;

import javax.persistence.*;
import javax.transaction.Transaction;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class ItemDAO {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("hibernate");
    @PersistenceContext
    private EntityManager entityManager;

    public void add (Item item) {
        entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(item);
        entityTransaction.commit();
        entityManager.close();
    }

    public void delete (int id) {
        entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Item item = entityManager.find(Item.class, id);
        entityManager.remove(item);
        entityTransaction.commit();
        entityManager.close();
    }

    public void update (int id, Item item) {
        entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Item item1 = entityManager.find(Item.class, id);
        item1.setName(item.getName());
        item1.setPrice(item.getPrice());
        item1.setInfo(item.getInfo());
        entityManager.persist(item1);
        entityTransaction.commit();
        entityManager.close();
    }

    public List<Item> getAll () {
        entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        String query = "SELECT i FROM Item i";
        TypedQuery<Item> typedQuery = entityManager.createQuery(query, Item.class);
        return typedQuery.getResultList();
    }
}
