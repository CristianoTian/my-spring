package com.tt.test.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther thy
 * @date 2019/12/2
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
		ConditionBean bean = context.getBean(ConditionBean.class);
		bean.sayHi();
	}
}
