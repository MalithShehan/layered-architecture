package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public interface OrderDetailsDAO {
    boolean saveOrderDetail(OrderDetailDTO dto) throws SQLException, ClassNotFoundException;
}
