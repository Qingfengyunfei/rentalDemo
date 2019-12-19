package com.yunfan.rental.rental.service;

import com.yunfan.rental.rental.entity.House;

public interface IHouseService {

    House save(House house);


    House findById(Long id);
}
