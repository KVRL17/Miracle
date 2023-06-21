package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@Autowired
	AOservices Ao;
	@GetMapping("add/{a}/{b}")
    public int add(@PathVariable int a, @PathVariable int b) {
        return Ao.add(a,b);
    }

    @GetMapping("sub")
    public int sub(@RequestParam("a")  int a, @RequestParam("b")  int b) {
        return Ao.sub(a,b);
    }
    @GetMapping("mul")
    public int multi(@RequestParam("a")  int a, @RequestParam("b")  int b) {
        return Ao.mul(a,b);
    }
    @GetMapping("div/{a}/{b}")
    public String div(@PathVariable int a, @PathVariable int b) {
    	return Ao.div(a,b);
    }
}



