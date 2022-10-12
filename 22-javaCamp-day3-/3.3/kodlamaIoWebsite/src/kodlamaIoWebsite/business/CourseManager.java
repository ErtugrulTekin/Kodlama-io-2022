package kodlamaIoWebsite.business;

import java.util.List;

import kodlamaIoWebsite.core.logging.ILogger;
import kodlamaIoWebsite.dataAccess.interfaceDao.ICourseDao;
import kodlamaIoWebsite.entities.Course;

public class CourseManager {
	private final ICourseDao courseDao;
	private final ILogger[] loggers;
	private final List<Course> courses;
	
	public CourseManager(ICourseDao courseDao, ILogger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}
	
	public void add(Course course) throws Exception{
		for (Course crs : courses) {
			if(crs.getCourseName() == course.getCourseName()) {
				throw new Exception("Kurs ismi tekrar edemez.");
			}
			
			if(course.getPrice()<=0) {
				throw new Exception("Kurs fiyatı sıfırdan küçük olamaz.");
			}
		}
		
		courseDao.add(course);
		courses.add(course);
		
		for(ILogger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
	
}
