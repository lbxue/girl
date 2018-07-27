package com.example.girl.Controller;

import com.example.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    /*@RequestMapping(value = {"/say1/{id}","/say2/{id}"},method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id) {
        return "Girl1 cupSize is " + girlProperties.getCupSize()
                + " and age is " + girlProperties.getAge() + " id: " + id;
    }*/

    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        return "id：" + id;
    }
}
