package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderDetailsBO {
     ArrayList<OrderDetailDTO> getAll() throws SQLException, ClassNotFoundException ;
     boolean save(OrderDetailDTO dto) throws SQLException, ClassNotFoundException;
     boolean update(OrderDetailDTO dto) throws SQLException, ClassNotFoundException;
     boolean exist(String id) throws SQLException, ClassNotFoundException;
     String generateID() throws SQLException, ClassNotFoundException;
     void delete(String id) throws SQLException, ClassNotFoundException;
     OrderDetailDTO search(String id) throws SQLException, ClassNotFoundException;
}
