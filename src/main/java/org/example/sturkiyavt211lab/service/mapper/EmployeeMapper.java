package org.example.sturkiyavt211lab.service.mapper;

import org.example.sturkiyavt211lab.dto.EmployeeDto;
import org.example.sturkiyavt211lab.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mapping(source = "bank.name", target = "bankName")
    @Mapping(source = "office.name", target = "officeName")
    EmployeeDto toDto(Employee employee);

}
