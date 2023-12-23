package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderBO {
    public ArrayList<OrderDTO> getAll() throws SQLException, ClassNotFoundException;
    public boolean save(OrderDTO dto) throws SQLException, ClassNotFoundException ;
    public boolean update(OrderDTO dto) throws SQLException, ClassNotFoundException ;
    public boolean exist(String id) throws SQLException, ClassNotFoundException ;
    public String generateID() throws SQLException, ClassNotFoundException ;
    public void delete(String id) throws SQLException, ClassNotFoundException ;
    public OrderDTO search(String id) throws SQLException, ClassNotFoundException ;
}
