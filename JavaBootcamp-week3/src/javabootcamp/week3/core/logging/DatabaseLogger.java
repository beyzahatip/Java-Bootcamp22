/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabootcamp.week3.core.logging;

/**
 *
 * @author LENOVO
 */
public class DatabaseLogger implements Logger{
     @Override
     public void log(String data) {
        System.out.println("Logged to database" +data);
    }
}
