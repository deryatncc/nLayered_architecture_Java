package nLayered.dataAccess.concretes;

import nLayered.dataAccess.abstracts.CategoryDao;
import nLayered.entities.concretes.Category;

public class CategoryData implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category information has been added.");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Category information has been deleted.");
	}

}
