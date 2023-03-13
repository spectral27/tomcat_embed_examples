package spc;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

import java.io.File;

public class Main {

    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.getConnector();

        ResourceConfig resourceConfig = new ResourceConfig();
        resourceConfig.packages(Main.class.getPackageName());

        ServletContainer servletContainer = new ServletContainer(resourceConfig);

        tomcat.addServlet("", "defaultServlet", servletContainer);

        Context context = tomcat.addContext("", new File(".").getAbsolutePath());
        context.addServletMappingDecoded("/*", "defaultServlet");

        tomcat.start();

        // curl -w "\n" http://localhost:8080/hello
    }

}
