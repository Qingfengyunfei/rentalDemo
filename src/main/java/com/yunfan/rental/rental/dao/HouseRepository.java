package com.yunfan.rental.rental.dao;

import com.yunfan.rental.rental.entity.House;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HouseRepository extends PagingAndSortingRepository<House, Long>,
        JpaSpecificationExecutor<House> {
}
