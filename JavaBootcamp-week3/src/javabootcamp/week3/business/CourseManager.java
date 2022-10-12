
package javabootcamp.week3.business;

import javabootcamp.week3.core.logging.Logger;
import javabootcamp.week3.dataAccess.CourseDao;
import javabootcamp.week3.entities.Course;


public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    
    public CourseManager(CourseDao courseDao,Logger[] loggers){
        this.courseDao=courseDao;
        this.loggers=loggers;
    }
    
    public void add(Course course) throws Exception{
        if(course.getPrice()<0){
            throw new Exception("Price of course cannot be less than 0");
        }
        courseDao.add(course);
        
        for (Logger logger : loggers) {
            logger.log(course.getName());
        }
    }
    
    
}
