package Pointcut;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
@Pointcut("execution(* Pointcut.*.*(..))")
private void selectAll() {
	@Before("selectAll")
	public void beforeAdvice() {
		System.out.println("going to setup student profile.");
	}
	@Around("execution(* Pointcut.Student.hello(..))")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable{
		long startTime=System.currentTimeMillis();
		Object result=joinPoint.proceed();
		long endTime=System.currentTimeMillis();
		System.out.println("Method "+joinPoint.getSignature()+"executed in "+
		(endTime-startTime)+"ms");
		return result;
	}
	@After ("selectAll()")
	public void afterAdvice() {
		System.out.println("Student profile has been setup");
	}
	@AfterReturning(pointcut="selectAll()", returning="retVal")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("Returning:"+retVal.toString());
	}
	@AfterThrowing(pointcut="selectAll()", throwing="ex")
	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an exception:"+ex.toString());
	}
	
}
}
