package com.tt.test;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletRegistration;

/**
 * @auther thy
 * @date 2019/10/18
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(javax.servlet.ServletContext servletContext) {
		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		ac.register(AppConfig.class);
//		ac.refresh();

		DispatcherServlet dispatcherServlet = new DispatcherServlet(ac);
		ServletRegistration.Dynamic tt = servletContext.addServlet("tt", dispatcherServlet);
		tt.setLoadOnStartup(1);
		tt.addMapping("*");
	}
}