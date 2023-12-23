package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.ItemDAO;
import com.example.layeredarchitecture.dao.custom.impl.ItemDAOImpl;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBOImpl implements ItemBO{
    ItemDAO itemDAO = new ItemDAOImpl();
    @Override
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();
    }

    @Override
    public void deleteItem(String code) throws SQLException, ClassNotFoundException {
         itemDAO.delete(code);
    }

    @Override
    public boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.save(dto);
    }

    @Override
    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.update(dto);
    }

    @Override
    public boolean existItem(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.exist(code);
    }

    @Override
    public String generateItemID() throws SQLException, ClassNotFoundException {
        return itemDAO.generateID();
    }

    @Override
    public ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.search(code);
    }
}
