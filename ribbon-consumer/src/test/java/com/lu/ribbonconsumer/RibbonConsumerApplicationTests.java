package com.lu.ribbonconsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RibbonConsumerApplicationTests {

	@Test
	public void contextLoads() {

		String a = new String("a");
		String b = new String("a");
		System.out.println(a == b);
		System.out.println(a.equals(b));

	}

}
