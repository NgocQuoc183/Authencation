package quoc.dev.data.dao;

import quoc.dev.data.dao.CategoryDao;
import quoc.dev.data.dao.DatabaseDao;
import quoc.dev.data.dao.OrderDao;
import quoc.dev.data.dao.OrderItemDao;
import quoc.dev.data.dao.ProductDao;
import quoc.dev.data.dao.UserDAO;
import quoc.dev.data.impl.CategoryImpl;
import quoc.dev.data.impl.OrderImpl;
import quoc.dev.data.impl.OrderItemImpl;
import quoc.dev.data.impl.ProductImpl;
import quoc.dev.data.impl.UserImpl;

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
