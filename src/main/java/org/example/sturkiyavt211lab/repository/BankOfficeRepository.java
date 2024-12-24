package org.example.sturkiyavt211lab.repository;

import org.example.sturkiyavt211lab.entity.BankOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankOfficeRepository extends JpaRepository<BankOffice, Long> {
}
