package com.tt.test.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @auther thy
 * @date 2019/12/2
 */
@Conditional(MyCondition.class)
@Configuration
public class ConditionConfig {

	@Bean
	public ConditionBean conditionBean(){
		return new ConditionBean();
	}
}
