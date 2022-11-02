package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	
	LanguageRepository languageRepository;	
	
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
		
	}


	@Override
	public List<Language> getAll() {
		
		return languageRepository.getAll();
	}


	@Override
	public void delete(int id) {
		languageRepository.delete(id);;
		
	}


	@Override
	public void update(int id,String name) {
		languageRepository.update(id,name);
		
	}


	@Override
	public void add(String name) {
		
	}




}
