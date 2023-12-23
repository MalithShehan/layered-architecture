package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.OrderDetailsDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDetailsDAOImpl;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDetailsBOImpl implements OrderDetailsBO{
    OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAOImpl();
    @Override
    public ArrayList<OrderDetailDTO> getAllOrderDetails() throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.getAll();
    }

    @Override
    public boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.save(dto);
    }

    @Override
    public boolean updateOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.update(dto);
    }

    @Override
    public boolean existOrderDetails(String id) throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.exist(id);
    }

    @Override
    public String generateOrderDetailsID() throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.generateID();
    }

    @Override
    public void deleteOrderDetails(String id) throws SQLException, ClassNotFoundException {

    }

    @Override
    public OrderDetailDTO searchOrderDetails(String id) throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.search(id);
    }
}
