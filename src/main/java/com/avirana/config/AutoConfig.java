package com.avirana.config;

import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("com.avirana.entity")
public class AutoConfig {}
