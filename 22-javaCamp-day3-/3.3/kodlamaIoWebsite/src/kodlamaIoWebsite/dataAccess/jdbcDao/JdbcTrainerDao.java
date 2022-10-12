package kodlamaIoWebsite.dataAccess.jdbcDao;

import kodlamaIoWebsite.dataAccess.interfaceDao.ITrainerDao;
import kodlamaIoWebsite.entities.Trainer;

public class JdbcTrainerDao implements ITrainerDao{

	@Override
	public void add(Trainer trainer) {
		System.out.println("JDBC ile veritabanına eklendi.");
	}

}
