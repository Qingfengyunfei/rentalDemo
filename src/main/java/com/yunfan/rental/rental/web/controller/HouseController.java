package com.yunfan.rental.rental.web.controller;

import com.yunfan.rental.rental.entity.House;
import com.yunfan.rental.rental.service.IHouseService;
import com.yunfan.rental.rental.web.dto.HouseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HouseController {

    @Autowired
    IHouseService service;

    @Autowired
    ModelMapper modelMapper;

    @GetMapping("/house")
    public HouseDTO show(@PathVariable(value = "id") Long houseId){
        House house = service.findById(houseId);
        HouseDTO dto = modelMapper.map(house, HouseDTO.class);
        return dto;
    }
}
