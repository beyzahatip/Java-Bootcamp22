
package javabootcamp.week3.dataAccess;

import javabootcamp.week3.entities.Instructor;


public class JdbcInstructorDao implements InstructorDao{

    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor is added database with jdbc");
         
    }
    
}
