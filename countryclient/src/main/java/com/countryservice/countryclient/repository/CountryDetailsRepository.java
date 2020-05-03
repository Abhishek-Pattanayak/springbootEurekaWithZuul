package com.countryservice.countryclient.repository;

import org.springframework.data.repository.CrudRepository;

import com.countryservice.countryclient.model.CountryDetails;

public interface CountryDetailsRepository extends CrudRepository<CountryDetails, Integer>{

}
