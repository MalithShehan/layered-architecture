package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.SuperDAO;
import com.example.layeredarchitecture.model.CustomDTO;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;

public interface QueryDAO extends SuperDAO {

    void customerOrderDetails(CustomDTO customDTO) throws SQLException, ClassNotFoundException;
}
