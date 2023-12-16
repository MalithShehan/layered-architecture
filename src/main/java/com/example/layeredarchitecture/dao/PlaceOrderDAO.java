package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface PlaceOrderDAO {
    public ItemDTO findItem(String code) throws SQLException, ClassNotFoundException ;
    public CustomerDTO searchCustomer(String newValue) throws SQLException, ClassNotFoundException ;

    public boolean existItems(String code) throws SQLException, ClassNotFoundException;
    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;
}
