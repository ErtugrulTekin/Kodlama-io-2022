package kodlamaIoWebsite.business;

import java.util.List;
import kodlamaIoWebsite.core.logging.ILogger;
import kodlamaIoWebsite.dataAccess.interfaceDao.ICategoryDao;
import kodlamaIoWebsite.entities.Category;

public class CategoryManager {
	private final ICategoryDao categoryDao;
	private final ILogger[] loggers;
	private final List<Category> categories;
	
	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers, List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void add(Category category)throws Exception{
		for (Category ctgry : categories) {
			if(ctgry.getCategoryName() == category.getCategoryName()){
				throw new Exception("Kategori ismi tekrar edemez.");
			}
		}
		categoryDao.add(category);
		categories.add(category);
		
		for (ILogger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
