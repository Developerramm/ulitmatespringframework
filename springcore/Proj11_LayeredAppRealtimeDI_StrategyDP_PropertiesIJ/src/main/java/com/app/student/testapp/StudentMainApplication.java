package com.app.student.testapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.student.controller.StudentMainController;
import com.app.student.vo.StudentVo;

public class StudentMainApplication {
	public static void main(String[] args) {
		ApplicationContext context = null;
		StudentMainController controller = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		controller =  context.getBean("controller",StudentMainController.class);
		
		StudentVo vo = new StudentVo();
		vo.setId("1006");
		vo.setName("cv raman kumar");
		vo.setEmail("raman@gmail.com");
		vo.setCourseName("Node js");
		vo.setObtMarks("200");
		
		try {
			controller.registerStudentRequest(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			((AbstractApplicationContext)context).close();
		}
		
	}
}
