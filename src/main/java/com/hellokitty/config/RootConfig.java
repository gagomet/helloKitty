package com.hellokitty.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by KAKolesnikov on 2015-04-28.
 */
@Configuration
@ComponentScan("com.hellokitty.service")
@Import({WebConfig.class})
public class RootConfig {

}
