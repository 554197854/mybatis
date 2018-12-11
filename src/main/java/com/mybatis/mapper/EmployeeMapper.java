package com.mybatis.mapper;

import com.mybatis.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author N
 * @create 2018/12/3 -- 20:35
 */
@Mapper
public interface EmployeeMapper {

    public Employee getEmp(Integer id);

    public int insertEmp(Employee employee);

    public int updateEmp(Employee employee);

    public int delEmp(Integer id);
}
