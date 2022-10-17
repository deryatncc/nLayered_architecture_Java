package nLayered.dataAccess.abstracts;

import nLayered.entities.concretes.Category;

public interface CategoryDao {
void add(Category category);
void delete(Category category);
}
