
package javabootcamp.week3.business;

import javabootcamp.week3.core.logging.Logger;
import javabootcamp.week3.dataAccess.CategoryDao;
import javabootcamp.week3.entities.Category;


public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    
     public CategoryManager(CategoryDao categoryDao,Logger[] loggers){
        this.categoryDao=categoryDao;
        this.loggers=loggers;
    }
     public void add(Category category){
        
        categoryDao.add(category);
        
        for (Logger logger : loggers) {
            logger.log(category.getName());
        }
    }
    
}
