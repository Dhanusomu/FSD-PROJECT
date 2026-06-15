package com.example.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sbcalc {
    @GetMapping("/calc/{a}/{b}")
    public String calc(@PathVariable int a,@PathVariable int b)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("add ").append(a+b).append("\n");
        sb.append("sub ").append(a-b).append("\n");
        sb.append("mul ").append(a*b).append("\n");
        if(b!=0)
        {
            sb.append("div ").append(a/b).append("\n");
            sb.append("mod ").append(a%b).append("\n");
        }
        else {
            sb.append("div Division by zero is not possible\n");
            sb.append("mod Division by zero is not possible\n");
        }
        return "<pre>" + sb.toString()+"</pre>";
    }
}
