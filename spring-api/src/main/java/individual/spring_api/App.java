package individual.spring_api;

import java.io.File;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
	
	private static Tomcat tomcat = new Tomcat();
	
	public static void main(String[] args) throws LifecycleException {
		tomcat.setPort(8080);
		tomcat.getConnector();
		tomcat.addWebapp("", new File(".").getAbsolutePath());
		tomcat.start();
		tomcat.getServer().await();
	}
	
}
