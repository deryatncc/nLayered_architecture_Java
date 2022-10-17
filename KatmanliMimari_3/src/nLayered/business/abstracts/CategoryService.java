package nLayered.business.abstracts;

import nLayered.entities.concretes.Category;

public interface CategoryService {
void add(Category category) throws Exception;
void delete(Category category);
}
