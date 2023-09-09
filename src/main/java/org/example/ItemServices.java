package org.example;

import java.util.List;

public class ItemServices {
    public static void addItem (Item item) {
        ItemDAO itemDAO = new ItemDAO();
        itemDAO.add(item);
    }

    public static void DeleteItem (int id) {
        ItemDAO itemDAO = new ItemDAO();
        itemDAO.delete(id);
    }

    public static void UpdateItem (int id, Item item) {
        ItemDAO itemDAO = new ItemDAO();
        itemDAO.update(id, item);
    }

    public static List<Item> getAll () {
        ItemDAO itemDAO = new ItemDAO();
        return itemDAO.getAll();
    }
}
