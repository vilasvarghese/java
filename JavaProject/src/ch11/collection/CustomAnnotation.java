package ch11.collection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//This will be applied at runtime
@Target(ElementType.TYPE)
public @interface CustomAnnotation {

	public enum Priority{
		LOW, MEDIUM, HIGH
	}
	
	Priority priority() default Priority.LOW;
	String[] tags() default "";
}
