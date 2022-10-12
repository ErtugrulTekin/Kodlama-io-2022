package kodlamaIoWebsite.dataAccess.hibernateDao;

import kodlamaIoWebsite.dataAccess.interfaceDao.ICategoryDao;
import kodlamaIoWebsite.entities.Category;

public class HibernateCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi.");
	}

}
