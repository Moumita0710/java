package com.aop.services.Spring_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con=new ClassPathXmlApplicationContext("com/aop/services/Spring_AOP/config.xml");
    	PaymentService ob=(PaymentService) con.getBean("payment");
    	ob.makePayment();

    }
}
