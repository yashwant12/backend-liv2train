package com.example.backend_liv2train.dao;

import com.example.backend_liv2train.entity.Center;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrainingCenterDAOImpl implements TrainingCenterDAO{

    // inject the session factory
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Center> getCenters() {
        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Center> theQuery =
                currentSession.createQuery("from Center", Center.class);

        // execute query and get result list
        List<Center> centers = theQuery.getResultList();
        return centers;
    }

    @Override
    public void addCenter(Center theCenter) {

        // get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // save/update the customer
        currentSession.saveOrUpdate(theCenter);

    }
}
