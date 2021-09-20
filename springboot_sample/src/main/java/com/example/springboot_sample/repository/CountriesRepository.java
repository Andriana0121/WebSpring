package com.example.springboot_sample.repository;

import java.util.ArrayList;
import java.util.Arrays;

public class CountriesRepository {

    //String[] countries = {"Moldova", "Ucraina", "Romania"};
    ArrayList<String> countries = new ArrayList<>();

    public CountriesRepository(){
        this.countries.add("Moldova");
        this.countries.add("Ucraina");
        this.countries.add("Romania");
        this.countries.add("Turkey");
    }

    public String create(String countryName){
        this.countries.add(countryName);
        return "Create Country";
    }

    public String read(Integer id){
        try{
            return id + ":" + this.countries.get(id);
        } catch (Exception exception){
            return "Not found";
        }

    }

    public String readAll(){
        return this.countries.toString();
    }

    public String update(){
        return "Update Country";
    }

    public String delete(){
        return "Delete Country";
    }
}
