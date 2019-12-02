package com.tt.test.component;

import org.springframework.context.Lifecycle;
import org.springframework.context.LifecycleProcessor;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @auther thy
 * @date 2019/10/31
 */
@Component
public class Mylifecycle implements SmartLifecycle {
	@Override
	public void start() {
		System.out.println("容器启动");
	}

	@Override
	public void stop() {
		System.out.println("容器停止");
	}

	@Override
	public boolean isRunning() {
		return false;
	}

	public int getPhase(){
		return 0;
	}
}
