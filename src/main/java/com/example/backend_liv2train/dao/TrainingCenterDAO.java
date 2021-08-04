package com.example.backend_liv2train.dao;

import com.example.backend_liv2train.entity.Center;

import java.util.List;

public interface TrainingCenterDAO {

    public List<Center> getCenters();

    public void addCenter(Center theCenter);
}
