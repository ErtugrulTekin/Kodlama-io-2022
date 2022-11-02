package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();

	void add(ProgrammingLanguage programmingLanguage);

	void update(ProgrammingLanguage programmingLanguage);

	void delete(int id);

	ProgrammingLanguage getById(int id);
}
