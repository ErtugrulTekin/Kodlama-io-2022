package kodlamaIoWebsite.dataAccess.hibernateDao;

import kodlamaIoWebsite.dataAccess.interfaceDao.ITrainerDao;
import kodlamaIoWebsite.entities.Trainer;

public class HibernateTrainerDao implements ITrainerDao{

	@Override
	public void add(Trainer trainer) {
		System.out.println("Hibernate ile veritabanına eklendi.");
	}

}
