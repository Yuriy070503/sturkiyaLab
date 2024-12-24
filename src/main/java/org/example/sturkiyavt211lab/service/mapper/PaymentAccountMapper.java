package org.example.sturkiyavt211lab.service.mapper;

import org.example.sturkiyavt211lab.dto.PaymentAccountDto;
import org.example.sturkiyavt211lab.entity.PaymentAccount;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PaymentAccountMapper {

    @Mapping(source = "bank.id", target = "bankId")
    @Mapping(source = "user.id", target = "userId")
    PaymentAccountDto toDto(PaymentAccount paymentAccount);

}
