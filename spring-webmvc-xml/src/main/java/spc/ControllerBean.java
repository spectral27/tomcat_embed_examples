package spc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bean")
public class ControllerBean {

    @Autowired
    private ServiceBean serviceBean;

    @GetMapping
    public String hello() {
        return serviceBean.hello();
    }

}
