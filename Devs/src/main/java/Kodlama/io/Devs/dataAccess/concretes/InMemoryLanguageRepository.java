package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;


@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		
		languages = new ArrayList<Language>();
		
		languages.add(new Language(1,"C"));
		languages.add(new Language(2,"Java"));
		languages.add(new Language(3,"Python"));
		languages.add(new Language(4,"C#"));
		
		
	}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public void add(int id,String name) {
		
		languages.add(new Language(id,name));
	}

	@Override
	public void delete(int id) {
		
		if(languages.get(id).getId() == id) {
			languages.remove(id);
		}
		
	}

	@Override
	public void update(int id,String name) {
		if(!name.isEmpty()) {
			languages.get(id).setLanguageName(name);
		}
	}
	



}
