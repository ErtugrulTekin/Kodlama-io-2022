package kodlamaIoWebsite.dataAccess.jdbcDao;

import kodlamaIoWebsite.dataAccess.interfaceDao.ICategoryDao;
import kodlamaIoWebsite.entities.Category;

public class JdbcCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veritabanına eklendi.");
	}
	
}
