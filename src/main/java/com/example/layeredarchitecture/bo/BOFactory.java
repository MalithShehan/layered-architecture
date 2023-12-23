package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.bo.custom.CustomerBOImpl;
import com.example.layeredarchitecture.bo.custom.ItemBOImpl;
import com.example.layeredarchitecture.bo.custom.PlaceOrderBOImpl;

public class BOFactory {

    private static BOFactory boFactory;

    private BOFactory(){

    }
    public static BOFactory getBoFactory(){
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public enum BOTypes{
        CUSTOMER, ITEM, PLACE_ORDER
    }

    public SuperBO getBO(BOTypes boTypes) {
        switch (boTypes) {
            case CUSTOMER:
                return new CustomerBOImpl();
            case ITEM:
                return new ItemBOImpl();
            case PLACE_ORDER:
                return new PlaceOrderBOImpl();
            default:
                return null;
        }
    }
}