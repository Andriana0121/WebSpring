package com.example.springboot_sample.controller;

import com.example.springboot_sample.repository.CountriesRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {
    // CRUD
    CountriesRepository countriesRepository = new CountriesRepository();

    @PostMapping("")
    public String create(@RequestParam String countryName){
        return countriesRepository.create(countryName);
    }

    @GetMapping("countries/{id}")
    public String read(@PathVariable Integer id){
        return countriesRepository.read(id);
    }

    @GetMapping("countries")
    public String readAll(){
        return countriesRepository.readAll();
    }

    @PutMapping("countries")
    public String update(){
        return "Update Country";
    }

    @DeleteMapping("countries")
    public String delete(){
        return "Delete Country";
    }
}
