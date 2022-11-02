package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	
	List<Language> getAll();
	
	public void delete(int id);
	
	public void update(int id,String name);
	
	public void add(String name);
	
	

}
