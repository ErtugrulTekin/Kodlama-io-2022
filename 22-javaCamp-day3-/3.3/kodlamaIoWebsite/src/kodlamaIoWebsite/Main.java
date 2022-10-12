package kodlamaIoWebsite;

import java.util.ArrayList;
import java.util.List;

import kodlamaIoWebsite.business.CategoryManager;
import kodlamaIoWebsite.business.CourseManager;
import kodlamaIoWebsite.business.TrainerManager;
import kodlamaIoWebsite.core.logging.DatabaseLogger;
import kodlamaIoWebsite.core.logging.FileLogger;
import kodlamaIoWebsite.core.logging.ILogger;
import kodlamaIoWebsite.core.logging.MailLogger;
import kodlamaIoWebsite.dataAccess.hibernateDao.HibernateCourseDao;
import kodlamaIoWebsite.dataAccess.jdbcDao.JdbcCategoryDao;
import kodlamaIoWebsite.dataAccess.jdbcDao.JdbcTrainerDao;
import kodlamaIoWebsite.entities.Category;
import kodlamaIoWebsite.entities.Course;
import kodlamaIoWebsite.entities.Trainer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ILogger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		
		Trainer trainer = new Trainer(1, "Engin", "Demirog");
		TrainerManager trainerManager = new TrainerManager(new JdbcTrainerDao(), loggers);
		trainerManager.add(trainer);
		
		System.out.println("-----------------------------------------------------------------");
		
		Course course1 = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı- JAVA", 1000);
		Course course2 = new Course(2, "Senior Yazılım Geliştirici Yetiştirme Kampı", 500);
		Course course3 = new Course(3, "Yazılım Geliştirici Yetiştirme Kampı- JavaScript", 500);
		Course course4 = new Course(4, "Yazılım Geliştirici Yetiştirme Kampı- JAVA+REACT", 1500);
		Course course5 = new Course(5, "Yazılım Geliştirici Yetiştirme Kampı- C#+ANGULAR", 1500);
		Course course6 = new Course(6, "Programlama Giriş için Temel Kurs", 600);
		List<Course> courseList = new ArrayList<>();
		CourseManager courseManager =new CourseManager(new HibernateCourseDao(), loggers, courseList);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);
		courseManager.add(course5);
		courseManager.add(course6);
		
		System.out.println("-----------------------------------------------------------------");
		
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Algoritma");
		List<Category> categoryList = new ArrayList<>();
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categoryList);
		categoryManager.add(category1);
		categoryManager.add(category2);
		
		
	}

}
