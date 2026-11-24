package com.stockMovement.biteStore;

import org.springframework.boot.SpringApplication;

public class TestBiteStoreApplication {

	public static void main(String[] args) {
		SpringApplication.from(BiteStoreApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
