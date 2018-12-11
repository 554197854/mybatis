package com.mybatis.controller;

import com.mybatis.bean.Department;
import com.mybatis.mapper.DepartmentMapper;
import com.mybatis.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author N
 * @create 2018/12/3 -- 18:22
 */
@RestController
public class DepartmentController {

    @Autowired
    DepartmentService service;
    @GetMapping("/queryDepart")
    public Department depart(){
    Department department = new Department();
    department.setId(1);
    return service.getDepart(department);

    }

//    @GetMapping("/add/{name}")
//    public int departadd(@PathVariable("name") String name){
//        Department depart = new Department();
//        depart.setDepartmentName(name);
//        mapper.insertDept(depart);
//        return depart.getId();
//    }
}
