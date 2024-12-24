package org.example.sturkiyavt211lab.service;

import org.example.sturkiyavt211lab.dto.PaymentAccountDto;
import org.example.sturkiyavt211lab.entity.PaymentAccount;


public interface PaymentAccountService {
    PaymentAccountDto createPaymentAccount(Long userId, Long bankId);

    PaymentAccount getPaymentAccountById(Long id);

    PaymentAccountDto getPaymentAccountByIdDto(Long id);

    PaymentAccountDto updatePaymentAccount(Long id, Integer amount);

    void deletePaymentAccount(Long id);
}
