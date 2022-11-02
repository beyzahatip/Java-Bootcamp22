package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	
	List<Language> getAll();
	
	public void add(int id ,String name);
	
	public void delete(int id);
	
	public void update(int id, String name);


}
