package org.example.sturkiyavt211lab.service;

import org.example.sturkiyavt211lab.dto.BankDto;
import org.example.sturkiyavt211lab.entity.Bank;

public interface BankService {

    BankDto createBank(String bankName);

    Bank getBankById(Long id);

    BankDto getBankByIdDto(Long id);

    BankDto updateBank(Long id, String name);

    void deleteBank(Long id);
}
