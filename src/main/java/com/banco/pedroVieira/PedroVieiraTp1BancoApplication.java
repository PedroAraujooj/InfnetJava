package com.banco.pedroVieira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@ImportAutoConfiguration({FeignAutoConfiguration.class})
@SpringBootApplication
@EnableFeignClients(basePackageClasses = com.banco.pedroVieira.client.EnderecoClient.class)
public class PedroVieiraTp1BancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedroVieiraTp1BancoApplication.class, args);
	}

}
