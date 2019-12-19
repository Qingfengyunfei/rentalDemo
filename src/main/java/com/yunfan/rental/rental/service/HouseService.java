package com.yunfan.rental.rental.service;

import com.yunfan.rental.rental.dao.HouseRepository;
import com.yunfan.rental.rental.entity.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HouseService implements IHouseService{

    @Autowired
    HouseRepository repository;

    @Override
    public House save(House house) {
        return repository.save(house    );
    }

    @Override
    public House findById(Long id) {
        Optional<House> houseOpt = repository.findById(id);
        if(houseOpt.isPresent()){
            return houseOpt.get();
        }
        throw new NullPointerException("没有找到数据");
    }
}
