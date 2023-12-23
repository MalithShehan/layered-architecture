package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDAOImpl;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderBOImpl implements OrderBO{
    OrderDAO orderDAO = new OrderDAOImpl();
    @Override
    public ArrayList<OrderDTO> getAll() throws SQLException, ClassNotFoundException {
        return orderDAO.getAll();
    }

    @Override
    public boolean save(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return orderDAO.save(dto);
    }

    @Override
    public boolean update(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return orderDAO.update(dto);
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return orderDAO.exist(id);
    }

    @Override
    public String generateID() throws SQLException, ClassNotFoundException {
        return orderDAO.generateID();
    }

    @Override
    public void delete(String id) throws SQLException, ClassNotFoundException {
         orderDAO.delete(id);
    }

    @Override
    public OrderDTO search(String id) throws SQLException, ClassNotFoundException {
        return orderDAO.search(id);
    }
}
