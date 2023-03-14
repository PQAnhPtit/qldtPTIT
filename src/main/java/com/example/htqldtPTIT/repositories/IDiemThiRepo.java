package com.example.htqldtPTIT.repositories;

import com.example.htqldtPTIT.entities.DiemThi;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDiemThiRepo extends PagingAndSortingRepository<DiemThi, Integer> {

}
