package com.vrs.SpringMaven.jdbcCrudOpertion;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Config.java.SpringConfig;
import com.Student.bean.Student;
import com.StudentMapper.StudentMapper;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	//Insert Operation
    	
//    	System.out.println("Enter the id");
//    	int id=sc.nextInt();
//    	System.out.println("Enter the name");
//    	String name=sc.next();
//    	System.out.println("Enter the Section");
//    	String section=sc.next();
//    	System.out.println("Enter the marks");
//    	String marks=sc.next();
//        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);
//        JdbcTemplate jd=ac.getBean(JdbcTemplate.class);
//        String str="insert into Student values(?,?,?,?)";
//        int count=jd.update(str,id,name,section,marks);
//        if(count>0) {
//        	System.out.println("Data Inserted??");
//        }else {
//        	System.out.println("Failed to insert data");
//        }
    	//Update Operation
//    	System.out.println("enter the marks");
//    	String marks=sc.next();
//    	sc.nextLine();
//    	System.out.println("enter the name");
//    	String name=sc.nextLine();
    	ApplicationContext con=new AnnotationConfigApplicationContext(SpringConfig.class);
    	JdbcTemplate jdbc=con.getBean(JdbcTemplate.class);
//    	String updateStr="update student Set marks=? where name=?";
//    	int count=jdbc.update(updateStr,marks,name);
//    	if(count>0) {
//    		System.out.println("Updated Successfully");
//    	}else {
//    		System.out.println("Sorry Not Updated!!!");
//    	}
    	String selecct_str="select * from student";
    	List<Student> li_std=jdbc.query(selecct_str,new StudentMapper());
    	
    	for(Student std:li_std) {
    		System.out.println("Id: "+std.getId());
    		System.out.println("Name: "+std.getName());
    		System.out.println("Marks: "+std.getMarks());
    		System.out.println("Section: "+std.getSection());
    		System.out.println("---------------------------");
    	}
    	
    }
}
