package com.example.backend_liv2train.service;

import com.example.backend_liv2train.entity.Center;

import java.util.List;

public interface TrainingCenterService {

    public List<Center> getCenters();

    public void addCenter(Center theCenter);
}
