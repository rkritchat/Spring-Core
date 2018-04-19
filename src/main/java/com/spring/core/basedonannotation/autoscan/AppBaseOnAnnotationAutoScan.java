package com.spring.core.basedonannotation.autoscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.basedonannotation.autoscan.bean.Black;

/**
 * Hello world!
 *
 */
public class AppBaseOnAnnotationAutoScan
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApplicationAutoScan.class);
        Black black = context.getBean(Black.class);
        black.show();
    }
}
