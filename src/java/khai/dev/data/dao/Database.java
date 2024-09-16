package khai.dev.data.dao;

import khai.dev.data.dao.CategoryDao;
import khai.dev.data.dao.DatabaseDao;
import khai.dev.data.dao.OrderDao;
import khai.dev.data.dao.OrderItemDao;
import khai.dev.data.dao.ProductDao;
import khai.dev.data.dao.UserDAO;
import khai.dev.data.impl.CategoryImpl;
import khai.dev.data.impl.OrderImpl;
import khai.dev.data.impl.OrderItemImpl;
import khai.dev.data.impl.ProductImpl;
import khai.dev.data.impl.UserImpl;

public class Database extends DatabaseDao {
    @Override
    public ProductDao getProductDao() {
        // TODO Auto-generated method stub
        return new ProductImpl();
    }
    @Override
    public CategoryDao getCategoryDao() {
        // TODO Auto-generated method stub
        return new CategoryImpl();
    }
    @Override
    public OrderItemDao getOrderItemDao() {
        // TODO Auto-generated method stub
        return new OrderItemImpl();
    }
    @Override
    public OrderDao getOrderDao() {
        // TODO Auto-generated method stub
        return new OrderImpl();
    }
    @Override
    public UserDAO getUserDao() {
        // TODO Auto-generated method stub
        return new UserImpl();
    }
}
