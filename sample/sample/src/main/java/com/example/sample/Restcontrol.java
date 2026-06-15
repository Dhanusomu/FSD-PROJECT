package com.example.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontrol {
    @GetMapping("/myhtml2")
    public String sayhello(){
        return "<h1 style = 'color:pink'><center>Dhanu</center></h1> " +
                "<h3>This is my java class</h3> " +
                "<p>Tulips are spring-blooming perennial herbaceous bulbiferous geophytes in the Tulipa genus. Their flowers are usually large, showy, and brightly coloured, generally red, orange, pink, yellow, or white. They often have a different coloured blotch at the base of the tepals, internally. Because of a degree of variability within the populations and a long history of cultivation, classification has been complex and controversial. The tulip is a member of the lily family, Liliaceae, along with 14 other genera, where it is most closely related to Amana, Erythronium, and Gagea in the tribe Lilieae.</p> " +
                "<img src=https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6ALYss2ZsjEN2v7V02q7MVaqO0Iet8ci3hGdL_5n4sw&s=10><br><br>" +
                "<img src='/tulip image.webp'>" ;
    }
}
