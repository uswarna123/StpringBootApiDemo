package com.demo.stpringbootapidemo.controller;

import com.demo.stpringbootapidemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping(path = "/getUser")
    public ResponseEntity<Object> callingExternalApi()
    {
        Object response=demoService.callingExternalApi();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/getUser/{name}")
    public ResponseEntity<Object> getUser(@PathVariable String name)
    {
      Object res=demoService.getUser(name);
        return ResponseEntity.ok(res);
    }

    @GetMapping("/call")
    public String call(){
        return "Hey! There";
    }

}
