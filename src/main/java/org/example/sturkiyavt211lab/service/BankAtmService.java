package org.example.sturkiyavt211lab.service;

import org.example.sturkiyavt211lab.dto.BankAtmDto;
import org.example.sturkiyavt211lab.entity.BankAtm;

public interface BankAtmService {

    BankAtmDto createBankAtm(String name, String address, Boolean status, Long bankId,
                             Long bankOfficeId, Long employeeId, Boolean isIssuingMoney,
                             Boolean isDepositingMoney, Integer servicingCost);

    BankAtm getBankAtmById(Long id);

    BankAtmDto getBankAtmByIdDto(Long id);

    BankAtmDto updateBankAtm(Long id, String name, String address, Boolean status, Long bankId,
                       Long bankOfficeId, Long employeeId, Boolean isIssuingMoney,
                       Boolean isDepositingMoney, Integer servicingCost);

    void deleteBankAtm(Long id);
}
