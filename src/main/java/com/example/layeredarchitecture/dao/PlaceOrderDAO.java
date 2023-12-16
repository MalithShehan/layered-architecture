package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.ItemDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;

public interface PlaceOrderDAO {
    public ItemDTO findItem(String code) throws SQLException, ClassNotFoundException ;
    public CustomerDTO searchCustomer(String newValue) throws SQLException, ClassNotFoundException ;

    public boolean saveOrder(String orderId, LocalDate orderDate, String customerId, List<OrderDetailDTO> orderDetails) throws SQLException, ClassNotFoundException ;
    public String genarateNewId() throws SQLException, ClassNotFoundException ;
}
