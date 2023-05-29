package com.tpb.ekycbranch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
public class EkycBranchApplication {

	public static class RoleToken {
		public static String tokenVMS;
	}

	public static void main(String[] args) {
		SpringApplication.run(EkycBranchApplication.class, args);
	}

}
