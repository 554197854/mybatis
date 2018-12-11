package com.mybatis.controller;




import com.mybatis.bean.Employee;
import com.mybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author N
 * @create 2018/12/3 -- 22:37
 */
@RestController
public class EmplyeeController {
    @Autowired
    EmployeeMapper mapper;

    @GetMapping("/queryEmp/{id}")
    public Employee emp(@PathVariable("id") Integer id) {
        return mapper.getEmp(id);
    }

    @GetMapping("/addEmp")
    public int emp()
    {
        Employee employee = new Employee();
        employee.setLastName("A");
        employee.setEmail("134");
        employee.setGender(0);
        employee.setdId(2);
        mapper.insertEmp(employee);
        return employee.getId();
    }
}
