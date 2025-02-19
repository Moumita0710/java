package com.aop.services.Spring_AOP;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class MyAspect {
@Before("execution(public void com.aop.services.Spring_AOP.PaymentService.makePayment())")
public void printBefore() {
	System.out.println("Payment started.....");
}

}
