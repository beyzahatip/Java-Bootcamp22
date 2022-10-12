
package javabootcamp.week3.dataAccess;

import javabootcamp.week3.entities.Category;


public class HibernateCategoryDao implements CategoryDao {
   
    @Override
    public void add(Category category) {
        System.out.println("Category is added database with hibernate");
         //To change body of generated methods, choose Tools | Templates.
    }
}
