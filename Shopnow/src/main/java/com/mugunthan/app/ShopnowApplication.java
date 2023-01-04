package com.mugunthan.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mugunthan.app.models.TestDBConnectivity;
import com.mugunthan.app.models.TestRepository;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@EnableEncryptableProperties
@SpringBootApplication
public class ShopnowApplication implements CommandLineRunner{
	@Autowired
	private TestRepository testRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ShopnowApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<TestDBConnectivity> values = testRepo.findAll();
		values.forEach(System.out :: println);
	}

}
