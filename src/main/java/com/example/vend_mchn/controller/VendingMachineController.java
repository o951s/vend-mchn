package com.example.vend_mchn.controller;


import com.example.vend_mchn.model.VendingMachine;
import com.example.vend_mchn.service.VendingMachineService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vending")
public class VendingMachineController {
    public final VendingMachineService vendingMachineService;

    public VendingMachineController(VendingMachineService vendingMachineService) {
        this.vendingMachineService = vendingMachineService;
    }


    @GetMapping("/all")
    public List<VendingMachine> getAllVendingMachines() {
        System.out.println("fetching all vending machines");
        return vendingMachineService.findAllVendingMachines();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<VendingMachine> getVendingMachineById(@PathVariable("id") Long id) throws Throwable{
        VendingMachine vendingMachine = vendingMachineService.findVendingMachineById(id);
        return new ResponseEntity<>(vendingMachine, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<VendingMachine> addVendingMachine(@RequestBody VendingMachine vendingMachine){
        VendingMachine newVendingMachine = vendingMachineService.addVendingMachine(vendingMachine);
        return new ResponseEntity<>(vendingMachineService.saveVendingMachine(vendingMachine), HttpStatus.CREATED);

    }
    @PutMapping("/update")
    public ResponseEntity<VendingMachine> updateVendingMachine(@RequestBody VendingMachine vendingMachine){
        VendingMachine updateVendingMachine = vendingMachineService.updateVendingMachine(vendingMachine);
        return new ResponseEntity<>(vendingMachine, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteVendingMachine(@PathVariable("id") Long id) {  // @PathVariable ekledik
        vendingMachineService.deleteVendingMachine(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
