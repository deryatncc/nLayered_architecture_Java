package nLayered.business.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayered.business.abstracts.CategoryService;
import nLayered.core.Logger;
import nLayered.dataAccess.abstracts.CategoryDao;
import nLayered.entities.concretes.Category;

public class CategoryManager implements CategoryService {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	List<Category> categories = new ArrayList<>();

	@Override
	public void add(Category category) throws Exception {
		for (Category ctgry : categories) {
			if (ctgry.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Category name can not be same");

			}
		}
		this.categoryDao.add(category);
		this.categories.add(category);
		for(Logger logger: loggers) {
			logger.logToSystem(category.getCategoryName());
		}
	}

	@Override
	public void delete(Category category) {
		System.out.println("The category has been deleted from the system.");
		this.categoryDao.delete(category);
		for(Logger logger: loggers) {
			logger.logToSystem(category.getCategoryName());
		}
	}

}