package com.devsuperior.dsvendas;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.net.InetAddress;

@Slf4j
@SpringBootApplication
public class DsvendasApplication {

	private static final String ACCESS_URLS_MESSAGE_LOG =
			"\n\n Access URLs:\n----------------------------------------------------------\n\t External: \thttp://{}:{}/sellers\n----------------------------------------------------------\n";

	public static void main(final String[] args) {
		try {
			System.setProperty("spring.devtools.restart.enabled", "false");
			final SpringApplication app = new SpringApplication(DsvendasApplication.class);
			final Environment env = app.run().getEnvironment();
			log.info(
					ACCESS_URLS_MESSAGE_LOG,
					InetAddress.getLocalHost().getHostAddress(),
					env.getProperty("server.port"));
		} catch (Exception e) {
			log.error("Start Error.", e);
		}
	}


}
