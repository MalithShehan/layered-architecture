package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDAOImpl;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderBOImpl implements OrderBO{
    OrderDAO orderDAO = new OrderDAOImpl();
    @Override
    public ArrayList<OrderDTO> getAllOrder() throws SQLException, ClassNotFoundException {
        return orderDAO.getAll();
    }

    @Override
    public boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return orderDAO.save(dto);
    }

    @Override
    public boolean updateOrder(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return orderDAO.update(dto);
    }

    @Override
    public boolean existOrder(String id) throws SQLException, ClassNotFoundException {
        return orderDAO.exist(id);
    }

    @Override
    public String generateOrderID() throws SQLException, ClassNotFoundException {
        return orderDAO.generateID();
    }

    @Override
    public void deleteOrder(String id) throws SQLException, ClassNotFoundException {
         orderDAO.delete(id);
    }

    @Override
    public OrderDTO searchOrder(String id) throws SQLException, ClassNotFoundException {
        return orderDAO.search(id);
    }
}
