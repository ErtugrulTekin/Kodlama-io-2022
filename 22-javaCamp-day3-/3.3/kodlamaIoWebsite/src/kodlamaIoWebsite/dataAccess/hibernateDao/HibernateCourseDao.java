package kodlamaIoWebsite.dataAccess.hibernateDao;

import kodlamaIoWebsite.dataAccess.interfaceDao.ICourseDao;
import kodlamaIoWebsite.entities.Course;

public class HibernateCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanına eklendi.");
	}

}
