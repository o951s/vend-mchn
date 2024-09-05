package com.example.vend_mchn.service;

import com.example.vend_mchn.exception.UserNotFoundException;
import com.example.vend_mchn.model.VendingMachine;
import com.example.vend_mchn.repository.VendingMachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendingMachineService {
    private final VendingMachineRepository vendingMachineRepository;

    @Autowired
    public VendingMachineService(VendingMachineRepository vendingMachineRepository) {
        this.vendingMachineRepository = vendingMachineRepository;
    }

    public VendingMachine addVendingMachine(VendingMachine vendingMachine) {
        return vendingMachineRepository.save(vendingMachine);
    }
    public List<VendingMachine> findAllVendingMachines() {
        return vendingMachineRepository.findAll();
    }
    public VendingMachine updateVendingMachine(VendingMachine vendingMachine) {
        return vendingMachineRepository.save(vendingMachine);
    }

    public VendingMachine findVendingMachineById(Long id) throws Throwable {
        return vendingMachineRepository.findVendingMachineById(id)
                .orElseThrow(() -> new UserNotFoundException("Machine by id " + id + "was not found"));
    }
    public void deleteVendingMachine(Long id) {
        vendingMachineRepository.deleteById(id);
    }
    public VendingMachine saveVendingMachine(VendingMachine vendingMachine) {
        return vendingMachineRepository.save(vendingMachine);
    }


}
