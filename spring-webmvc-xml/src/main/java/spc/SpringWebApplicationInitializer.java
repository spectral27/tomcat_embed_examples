package spc;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        XmlWebApplicationContext appContext = new XmlWebApplicationContext();
        appContext.setConfigLocation("src/main/resources/beans.xml");

        ServletRegistration.Dynamic registration =
                servletContext.addServlet("defaultServlet", new DispatcherServlet(appContext));
        registration.setLoadOnStartup(1);
        registration.addMapping("/*");
    }

}
