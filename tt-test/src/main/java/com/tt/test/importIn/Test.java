package com.tt.test.importIn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther thy
 * @date 2019/12/2
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigTwo.class);
		Circle bean = context.getBean(Circle.class);
		Triangle bean1 = context.getBean(Triangle.class);
		bean.sayHi();
		bean1.sayHi();
	}
}
