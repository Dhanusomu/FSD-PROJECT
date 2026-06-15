package com.example.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Learn {
    @GetMapping("/hi/{name}")
    public String display(@PathVariable String name){
        if(name.equals("dhanu"))
        {
            return "My name is "+name;
        }
        else{
            return "Not my name";
        }
    }
    @GetMapping("/climate/{climate}")
    public String wea(@PathVariable int climate){
        if(climate <0)
        {
            return "Shivering";
        }
        else if(climate >= 0 && climate <=15)
        {
            return "Chill";
        }
        else if(climate>15 && climate <=24)
        {
            return "Happy";
        }
        else if(climate >=25 && climate <=30)
        {
            return "Towards hot";
        }
        else if (climate > 30 && climate <= 32)
        {
            return "Hotter";
        }
        else
        {
            return "OMG";
        }
    }
    @GetMapping("/intro/{name}/{city}/{course}")
    public String intro(@PathVariable String name ,@PathVariable String city,@PathVariable String course)
    {
        return "Hello,I am "+name+",from "+city+",welcome to "+course;
    }

}
