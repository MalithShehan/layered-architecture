package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderBO {
    public ArrayList<OrderDTO> getAllOrder() throws SQLException, ClassNotFoundException;
    public boolean saveOrder(OrderDTO dto) throws SQLException, ClassNotFoundException ;
    public boolean updateOrder(OrderDTO dto) throws SQLException, ClassNotFoundException ;
    public boolean existOrder(String id) throws SQLException, ClassNotFoundException ;
    public String generateOrderID() throws SQLException, ClassNotFoundException ;
    public void deleteOrder(String id) throws SQLException, ClassNotFoundException ;
    public OrderDTO searchOrder(String id) throws SQLException, ClassNotFoundException ;
}
