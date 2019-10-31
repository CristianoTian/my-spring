package com.tt.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @auther thy
 * @date 2019/10/10
 */
@Component
public class Y {

	@Autowired
	private X x;

	public Y() {
		System.out.println("init Y");
	}


	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("init Y......");
	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("destroy Y.........");
	}
}
