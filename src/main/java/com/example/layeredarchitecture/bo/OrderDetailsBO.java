package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderDetailsBO {
     ArrayList<OrderDetailDTO> getAllOrderDetails() throws SQLException, ClassNotFoundException ;
     boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException;
     boolean updateOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException;
     boolean existOrderDetails(String id) throws SQLException, ClassNotFoundException;
     String generateOrderDetailsID() throws SQLException, ClassNotFoundException;
     void deleteOrderDetails(String id) throws SQLException, ClassNotFoundException;
     OrderDetailDTO searchOrderDetails(String id) throws SQLException, ClassNotFoundException;
}
