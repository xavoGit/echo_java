package com.xavo.echo.v1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.xavo.echo.v1.EchoApplication;

@SpringBootTest
public class SmokeTest {

	@Autowired
	private EchoApplication app;

	@Test
	public void contextLoads() throws Exception {
		assertThat(app).isNotNull();
	}

}