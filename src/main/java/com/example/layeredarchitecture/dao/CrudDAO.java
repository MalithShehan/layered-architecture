package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface CrudDAO<T> {
    public List<T> getAll() throws SQLException, ClassNotFoundException ;

    public boolean save(T dto) throws SQLException, ClassNotFoundException ;

    public boolean update(T dto) throws SQLException, ClassNotFoundException ;

    public boolean delete(String id) throws SQLException, ClassNotFoundException ;

    public boolean exist(String id) throws SQLException, ClassNotFoundException ;

    public String generateNextId() throws SQLException, ClassNotFoundException ;


    public T getDetail(String id) throws SQLException, ClassNotFoundException ;
}
