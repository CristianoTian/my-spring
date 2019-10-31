package com.tt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther thy
 * @date 2019/10/10
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

//		ac.setAllowCircularReferences(false);
		System.out.println("start getBean");
		X bean = ac.getBean(X.class);
		System.out.println(bean);

	}
}
