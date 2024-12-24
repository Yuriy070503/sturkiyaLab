package org.example.sturkiyavt211lab.service;

import org.example.sturkiyavt211lab.dto.EmployeeDto;
import org.example.sturkiyavt211lab.entity.Employee;

import java.time.LocalDate;

public interface EmployeeService {
    EmployeeDto createEmployee(String fullName, LocalDate birthDate, String position, Long bankId,
                               Boolean isRemote, Long bankOfficeId, Boolean canIssueLoans, Integer salary);

    Employee getEmployeeById(Long id);

    EmployeeDto getEmployeeByIdDto(Long id);

    EmployeeDto updateEmployee(Long id, String fullName, String position, Long bankId,
                            Boolean isRemote, Long bankOfficeId, Boolean canIssueLoans, Integer salary);

    void deleteEmployee(Long id);
}
