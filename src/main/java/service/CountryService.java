package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CountryRepository;

@Service
public class CountryService {

	@Autowired
	CountryRepository countryDao;
	
	public Long countCountry() {
		return countryDao.count();
	}
}
