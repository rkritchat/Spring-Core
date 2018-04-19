package com.spring.core.baseonxml;

import com.spring.core.baseonxml.bean.Color;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.baseonxml.bean.Red;


/**
 * Hello world!
 *
 */
public class AppBaseOnXml 
{
    public static void main( String[] args ){
       ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
       Color color = context.getBean(Color.class);
       color.showColor();
    }
}
