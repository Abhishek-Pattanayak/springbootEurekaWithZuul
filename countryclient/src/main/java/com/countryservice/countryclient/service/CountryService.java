package com.countryservice.countryclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.countryservice.countryclient.dao.CountryDetailsDao;
import com.countryservice.countryclient.model.CountryDetails;

@Service
public class CountryService {
	@Autowired
	CountryDetailsDao countryDetailsDao;
	
	public CountryDetails getCountryCapital(int country_id) {
		return countryDetailsDao.getCountryDetails(country_id).get();
	}

	public CountryDetails saveCountryDetails(CountryDetails countryDetails) {
		return countryDetailsDao.saveCountryDetails(countryDetails);
	}
}
