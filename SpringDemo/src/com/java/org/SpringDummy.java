package com.java.org;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("deprecation")
public class SpringDummy {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle();
		
		BeanFactory factory = new XmlBeanFactory(new FileResource());

	}

}
