package kodlamaIoWebsite.dataAccess.jdbcDao;

import kodlamaIoWebsite.dataAccess.interfaceDao.ICourseDao;
import kodlamaIoWebsite.entities.Course;

public class JdbcCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veritabanına eklendi.");	
	}
	
}
