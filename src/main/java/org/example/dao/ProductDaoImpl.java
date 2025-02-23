package org.example.dao;

import org.example.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ProductDaoImpl implements ProductDao {

    private SessionFactory sessionFactory;

    public ProductDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Product product) {
        try(Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();
        }catch (RuntimeException re) {
            System.out.println(re.getLocalizedMessage());
        }catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    @Override
    public void delete(Long id) {



    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public Product findById(Long id) {
        Session session = sessionFactory.openSession();
        Product product = (Product) session.get(Product.class, id);
        return product;
    }
}
