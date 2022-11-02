package Kodlama.io.Devs.webapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.concretes.LanguageManager;
import Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/kodlama/io/Devs")
public class LanguageController {
	
	LanguageManager languageManager;
	
	@Autowired
	public LanguageController(LanguageManager languageManager) {
		this.languageManager = languageManager;
	}
	
	@GetMapping("/getall")
	public List<Language> getAll(){
		
		return languageManager.getAll();
	}
	
	@PutMapping("/update")
	public void update(int id , String name) {
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteLanguage(@PathVariable int id) {
		
		languageManager.delete(id);
	}
	
	
	
	

	
		

}
