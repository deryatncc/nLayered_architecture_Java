package nLayered.entities.concretes;

import nLayered.entities.abstracts.Entitiy;

public class Category implements Entitiy {
	private String categoryName;

	public Category() {

	}

	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
