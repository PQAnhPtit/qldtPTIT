package com.example.htqldtPTIT.repositories;

import com.example.htqldtPTIT.entities.DiemThi;
import com.example.htqldtPTIT.entities.MonHoc;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMonHocRepo extends PagingAndSortingRepository<MonHoc, Integer> {

}
