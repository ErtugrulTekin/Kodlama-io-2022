package kodlama.io.devs.wepApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguage")
public class ProgrammingLanguageController {
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageService.getAll();
	}
	
	@PostMapping
	public void add (@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
		programmingLanguageService.add(programmingLanguage);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) throws Exception {
		programmingLanguageService.delete(id);
	}
	
	@PutMapping("/{id}")
	public void update(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
		programmingLanguageService.update(programmingLanguage);
	}
	
	@GetMapping("/{id}")
	public ProgrammingLanguage getById(@PathVariable (name = "id")int id) throws Exception {
		return programmingLanguageService.getById(id);
	}
}
