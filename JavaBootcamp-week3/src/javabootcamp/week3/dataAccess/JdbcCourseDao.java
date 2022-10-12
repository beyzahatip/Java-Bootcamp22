
package javabootcamp.week3.dataAccess;

import javabootcamp.week3.entities.Course;


public class JdbcCourseDao implements CourseDao{

    @Override
    public void add(Course course) {
        System.out.println("Course is added database with jdbc");
        
    }
    
}
