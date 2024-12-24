package org.example.sturkiyavt211lab.service.mapper;

import org.example.sturkiyavt211lab.dto.BankDto;
import org.example.sturkiyavt211lab.entity.Bank;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankMapper {

    BankDto toDto(Bank bank);

}
