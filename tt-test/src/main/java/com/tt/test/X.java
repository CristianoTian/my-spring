package com.tt.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @auther thy
 * @date 2019/10/10
 */
@Component
public class X implements InitializingBean, DisposableBean {

	@Autowired
	private Y y;

	public X() {
		System.out.println("init X");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init X......");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy X.........");
	}

	public void init(){
		System.out.println("my init() X..");
	}
}
