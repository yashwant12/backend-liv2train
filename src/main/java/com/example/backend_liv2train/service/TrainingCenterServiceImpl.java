package com.example.backend_liv2train.service;

import com.example.backend_liv2train.dao.TrainingCenterDAO;
import com.example.backend_liv2train.entity.Center;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TrainingCenterServiceImpl implements  TrainingCenterService{

    @Autowired
    private TrainingCenterDAO trainingCenterDAO;

    @Override
    @Transactional
    public List<Center> getCenters() {
        return trainingCenterDAO.getCenters();
    }

    @Override
    @Transactional
    public void addCenter(Center theCenter) {
        trainingCenterDAO.addCenter(theCenter);
    }
}
