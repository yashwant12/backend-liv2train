package com.example.backend_liv2train.rest;

import com.example.backend_liv2train.entity.Center;
import com.example.backend_liv2train.service.TrainingCenterService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.Instant;

import java.util.List;


@RestController
@RequestMapping("/api")
public class TrainingCenterRestController {

    @Autowired
    private TrainingCenterService trainingCenterService;

    @GetMapping("/centers")
    public List<Center> getCenters() {

        return trainingCenterService.getCenters();

    }

    @PostMapping("/centers")
    public Center addCenter(@RequestBody @Valid Center theCenter) {

        theCenter.setId(0);

        long timeInSeconds = Instant.now().getEpochSecond();

        theCenter.setCreatedOn(timeInSeconds);

        trainingCenterService.addCenter(theCenter);

        return theCenter;

    }

}
