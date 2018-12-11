package com.mybatis.service;

import com.mybatis.bean.Department;
import com.mybatis.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author N
 * @create 2018/12/5 -- 13:31
 */
@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper mapper;
    @Cacheable(cacheNames = "emp",key="#depart.id")
    public Department getDepart(Department depart){
        System.out.println("cache");
        return mapper.getDeptById(depart.getId());
    }
}
