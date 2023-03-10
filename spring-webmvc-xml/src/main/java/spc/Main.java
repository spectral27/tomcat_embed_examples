package spc;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Tomcat tomcat = new Tomcat();
        tomcat.getConnector();

        tomcat.addWebapp("/spc", new File(".").getAbsolutePath());

        try {
            tomcat.start();
        } catch (LifecycleException e) {
            throw new RuntimeException(e);
        }

        // http://localhost:8080/spc/bean
    }

}
