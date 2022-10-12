/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabootcamp.week3.dataAccess;

import javabootcamp.week3.entities.Category;

/**
 *
 * @author LENOVO
 */
public class JdbcCategoryDao implements CategoryDao{

    @Override
    public void add(Category category) {
        System.out.println("Category is added database with jdbc");
        
    }
    
}
