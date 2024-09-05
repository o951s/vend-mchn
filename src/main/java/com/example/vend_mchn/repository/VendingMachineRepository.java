package com.example.vend_mchn.repository;

import com.example.vend_mchn.model.VendingMachine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VendingMachineRepository extends JpaRepository<VendingMachine, Long> {
    Optional<VendingMachine> findVendingMachineById(Long id);
}
