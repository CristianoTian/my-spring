package com.tt.test.importIn;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @auther thy
 * @date 2019/12/2
 */
@Import({Circle.class})
@Configuration
public class MainConfig {
}
