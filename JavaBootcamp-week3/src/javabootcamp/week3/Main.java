
package javabootcamp.week3;

import javabootcamp.week3.business.CategoryManager;
import javabootcamp.week3.business.CourseManager;
import javabootcamp.week3.business.InstructorManager;
import javabootcamp.week3.dataAccess.HibernateCategoryDao;
import javabootcamp.week3.dataAccess.HibernateCourseDao;
import javabootcamp.week3.dataAccess.HibernateInstructorDao;
import javabootcamp.week3.dataAccess.JdbcCategoryDao;
import javabootcamp.week3.dataAccess.JdbcCourseDao;
import javabootcamp.week3.dataAccess.JdbcInstructorDao;
import javabootcamp.week3.entities.Category;
import javabootcamp.week3.entities.Course;
import javabootcamp.week3.entities.Instructor;
import javabootcamp.week3.core.logging.Logger;
import javabootcamp.week3.core.logging.FileLogger;
import javabootcamp.week3.core.logging.DatabaseLogger;
import javabootcamp.week3.core.logging.MailLogger;



public class Main {

    
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
        
        Course course1 = new Course("JAVA",12,"Engin Demiroğ","Programlama");
        CourseManager courseManager=new CourseManager(new JdbcCourseDao(),loggers);
        CourseManager courseManager2=new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course1);
        courseManager2.add(course1);
        
        Category category1 = new Category("Programlama");
        CategoryManager categoryManager=new CategoryManager(new JdbcCategoryDao(),loggers);
        CategoryManager categoryManager2=new CategoryManager(new HibernateCategoryDao(),loggers);
        categoryManager.add(category1);
        categoryManager2.add(category1);
        
        Instructor instructor1=new Instructor("Engin", "Demirdağ","36", 15);
        InstructorManager instructorManager=new InstructorManager(new JdbcInstructorDao(),loggers);
        InstructorManager instructorManager2=new InstructorManager(new HibernateInstructorDao(),loggers);
        instructorManager.add(instructor1);
        instructorManager2.add(instructor1);
        
        
        
    }
    
}
