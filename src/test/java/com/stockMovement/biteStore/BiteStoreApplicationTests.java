package com.stockMovement.biteStore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Import;
import org.testcontainers.containers.MariaDBContainer;
import org.testcontainers.junit.jupiter.Container;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class BiteStoreApplicationTests {

	@Container
	@ServiceConnection
	static MariaDBContainer<?> db = new MariaDBContainer<>("mariadb:11.4");


	@Test
	void contextLoads() {
	}

}
