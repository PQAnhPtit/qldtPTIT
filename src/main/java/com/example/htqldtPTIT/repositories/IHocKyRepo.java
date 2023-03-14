package com.example.htqldtPTIT.repositories;

import com.example.htqldtPTIT.entities.HocKy;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHocKyRepo extends PagingAndSortingRepository<HocKy, Integer> {

}
