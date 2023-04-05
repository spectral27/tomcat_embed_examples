package individual.spring_api;

import java.io.File;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan
@Configuration
@EnableWebMvc
public class Main {
	
	private static final Tomcat tomcat = new Tomcat();
	private static final String contextPath = "";
	private static final String docBase = new File(".").getAbsolutePath();

	static {
		tomcat.getConnector();
		tomcat.addWebapp(contextPath, docBase);
	}
	
	public static void main(String[] args) throws LifecycleException {
		tomcat.start();
		tomcat.getServer().await();

		// curl -w "\n" -s http://localhost:8080/records | jq

		// TODO
		// Repository, Controller, Maven Shade
	}
	
}
