package com.codingdojo.com.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZookeeperApplication {

	public static void main(String[] args) {
		
//		Mammal mammal01 = new Mammal("something");
//		mammal01.setEnergyLevel(50);
//		System.out.println(mammal01.displayEnergy());
		
		
//		Gorilla gorilla01 = new Gorilla("Big Guy");
//		System.out.println(gorilla01.throwSomething(mammal01));
//		System.out.println(gorilla01.eatBananas());
//		System.out.println(gorilla01.eatBananas());
//		System.out.println(gorilla01.climb());
		
		Bat bat01 = new Bat("Author");
//		System.out.println(bat01.attackTown());
//		System.out.println(bat01.attackTown());
//		System.out.println(bat01.attackTown());
		System.out.println(bat01.fly());
		System.out.println(bat01.fly());
//		System.out.println(bat01.eatHuman());
//		System.out.println(bat01.eatHuman());

		
		
		
		
		SpringApplication.run(ZookeeperApplication.class, args);
	}

}
