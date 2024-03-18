package com.banco.pedroVieira;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackageClasses = com.banco.pedroVieira.client.EnderecoClient.class)
@SpringBootTest(properties = "spring.main.allow-bean-definition-overriding=true")

class PedroVieiraTp1BancoApplicationTests {

/*	@Test
	void contextLoads() {
	}*/

}
