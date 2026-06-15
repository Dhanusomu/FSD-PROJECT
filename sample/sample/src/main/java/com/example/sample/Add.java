package com.example.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Add {
    @GetMapping("/Add/add/{n1}/{n2}")
    public String add(@PathVariable int n1 , @PathVariable int n2){
        return "Addition "+ (n1+n2) ;
    }
    @GetMapping("/Add/dif/{n1}/{n2}")
    public String dif(@PathVariable int n1 , @PathVariable int n2){
        return "Subtraction "+ (n1-n2) ;
    }
    @GetMapping("/Add/mul/{n1}/{n2}")
    public String mul(@PathVariable int n1 , @PathVariable int n2){
        return "Multiplication "+ (n1*n2) ;
    }
    @GetMapping("/Add/div/{n1}/{n2}")
    public String div(@PathVariable int n1 , @PathVariable int n2){
        return "Division "+ (n1/n2) ;
    }
    @GetMapping("/Add/mod/{n1}/{n2}")
    public String mod(@PathVariable int n1 , @PathVariable int n2){
        return "Modulus "+ (n1%n2) ;
    }
    @GetMapping("/oddeven/{n1}/{n2}")
    public String oddeven(@PathVariable int n1 , @PathVariable int n2){
        int res = n1+n2 ;
        if(res%2==0)
        {
            return "Even";
        }
        else {
            return "Odd";
        }
    }

}
