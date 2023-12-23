package com.example.layeredarchitecture.dao.custom.impl;

import com.example.layeredarchitecture.dao.custom.QueryDAO;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.dto.CustomDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryDAOImpl implements QueryDAO {
    @Override
    public void customerOrderDetails(CustomDTO customDTO) throws SQLException, ClassNotFoundException {
        // join query
        Connection connection = DBConnection.getDbConnection().getConnection();
        String sql = "SELECT o.oid, o.date, c.id AS customer_id, c.name AS customer_name, " +
                "i.code AS item_code, i.description AS item_description, " +
                "od.qty, od.unitPrice " +
                "FROM Orders o " +
                "JOIN Customer c ON o.customerID = c.id " +
                "JOIN OrderDetails od ON o.oid = od.oid " +
                "JOIN Item i ON od.itemCode = i.code";

        try (PreparedStatement pstm = connection.prepareStatement(sql);
             ResultSet resultSet = pstm.executeQuery()) {

            while (resultSet.next()) {
                // Extract data from the result set
                String orderId = resultSet.getString("oid");
                String date = resultSet.getString("date");
                String customerId = resultSet.getString("customer_id");
                String customerName = resultSet.getString("customer_name");
                String itemCode = resultSet.getString("item_code");
                String itemDescription = resultSet.getString("item_description");
                int qty = resultSet.getInt("qty");
                double unitPrice = resultSet.getDouble("unitPrice");

                // Print the data to the terminal
                System.out.println("Order ID: " + orderId);
                System.out.println("Date: " + date);
                System.out.println("Customer ID: " + customerId);
                System.out.println("Customer Name: " + customerName);
                System.out.println("Item Code: " + itemCode);
                System.out.println("Item Description: " + itemDescription);
                System.out.println("Quantity: " + qty);
                System.out.println("Unit Price: " + unitPrice);
                System.out.println("------------------------------");
            }
        }
    }
}
