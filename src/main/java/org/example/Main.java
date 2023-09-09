package org.example;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

  /*  private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("hibernate");


    public static void addItem (String name, int price, String info) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            Item item = new Item(name, price, info);
            entityManager.persist(item);
            entityTransaction.commit();
        } catch(Exception e) {
            if(entityTransaction != null)
                entityTransaction.rollback();
            e.printStackTrace();
        }
        entityManager.close();
    }

    public static void deleteItem(int id) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction entityTransaction = null;
        Item item = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            item = entityManager.find(Item.class, id);
            entityManager.remove(item);
            entityTransaction.commit();
        } catch (Exception e) {
            if(entityTransaction != null)
                entityTransaction.rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    public static void getItems() {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        String query = "SELECT i FROM Item i WHERE i.id > :id1 AND i.id < :id2";
        TypedQuery<Item> typedQuery = entityManager.createQuery(query, Item.class);
        typedQuery.setParameter("id1", 1 );
        typedQuery.setParameter("id2", 10 );
        List<Item> items = new ArrayList<>();
       try{
           items = typedQuery.getResultList();
           for (Item el : items) {
               System.out.println(el);
           }
       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           entityManager.close();
       }
    }
    public static void main(String[] args) {
        addItem("I-phone", 500, "Black color");
        addItem("Samsung", 1000, "good phone");
        addItem("Lenovo", 100, "good laptop");
        addItem("Hp", 800, "ips");
        addItem("Asus", 600, "big ssd");
        addItem("Acer", 350, "good video");
        deleteItem(3);
        getItems();
        ENTITY_MANAGER_FACTORY.close();
    }*/

    public static void main(String[] args) {
        for (Item el : ItemServices.getAll()) {
            System.out.println(el);
        }

    }
}