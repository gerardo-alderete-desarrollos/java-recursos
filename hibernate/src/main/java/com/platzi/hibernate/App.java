package com.platzi.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.platzi.hibernate.dao.TeacherDaoImpl;
import com.platzi.hibernate.models.Course;
import com.platzi.hibernate.models.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        Teacher teacher = new Teacher("Christian", "Avatar 2");
        TeacherDaoImpl techerDaoImpl = new TeacherDaoImpl();
        techerDaoImpl.saveTeacher(teacher);
        List<Teacher> teachers = techerDaoImpl.findAllTeachers();
        
        for( Teacher t : teachers ) {
        	System.out.println("Nombre: " + t.getName());
        }
        
/*        Course course = new Course("Java Avanzado", "Rest Api", "Tema 1");
        session.beginTransaction();
        session.save(course);
        session.getTransaction().commit();*/
        
    }
}
