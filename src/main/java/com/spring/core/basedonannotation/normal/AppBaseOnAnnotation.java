package com.spring.core.basedonannotation.normal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.basedonannotation.normal.bean.Green;

/**
 * Hello world!
 *
 */
public class AppBaseOnAnnotation 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApplication.class);
        Green green = context.getBean(Green.class);
        green.show();
    }
}
