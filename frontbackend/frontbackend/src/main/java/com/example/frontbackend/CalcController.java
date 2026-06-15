package com.example.frontbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
public class CalcController {
    @GetMapping("/calc/add/{n1}/{n2}")
    public Map<String, Object> calc(@PathVariable int n1 , @PathVariable int n2)
    {
        return Map.of("operation","addition","result",n1+n2);
    }
    @GetMapping("/calc/sub/{n1}/{n2}")
    public Map<String, Object> sub(@PathVariable double n1, @PathVariable double n2) {
        return Map.of("operation","subtraction","result",n1-n2);
    }

    @GetMapping("/calc/mul/{n1}/{n2}")
    public Map<String, Object> mul(@PathVariable double n1, @PathVariable double n2) {
        return Map.of("operation","Multiplication","result",n1*n2);
    }

    @GetMapping("/calc/div/{n1}/{n2}")
    public Map<String, Object> div(@PathVariable double n1, @PathVariable double n2) {
        return Map.of("operation","Division","result",n1/n2);
    }

    @GetMapping("/calc/sqrt/{n}")
    public Map<String, Object> sqrt(@PathVariable double n) {
        return Map.of("operation","Sqaure root","result",Math.sqrt(n));
    }

    @GetMapping("/calc/sin/{n}")
    public Map<String, Object> sin(@PathVariable double n) {
        return Map.of("operation","sine","result",Math.sin(Math.toRadians(n)));
    }

    @GetMapping("/calc/cos/{n}")
    public Map<String, Object> cos(@PathVariable double n) {
        return Map.of("operation","Cosine","result",Math.cos(Math.toRadians(n)));
    }

    @GetMapping("/calc/tan/{n}")
    public Map<String, Object> tan(@PathVariable double n) {
        return Map.of("operation","tan","result",Math.round(Math.tan(Math.toRadians(n))));
    }

    @GetMapping("/calc/pow/{n1}/{n2}")
    public Map<String, Object> pow(@PathVariable double n1, @PathVariable double n2) {
        return Map.of("operation","power","result",Math.pow(n1, n2));
    }
    @GetMapping("/calc/log/{n}")
    public Map<String, Object> log(@PathVariable double n) {
        return Map.of("operation","log","result",Math.round(Math.log10(n)));
    }
    @GetMapping("/calc/spiralmatrix")
    public int[] spiralOrder()
    {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] arr=new int[9];

        int top = 0;
        int bottom = 3 - 1;
        int left = 0;
        int right = 3 - 1;
        int d=0;
        while (top <= bottom && left <= right)
        {
            for (int i = left; i <= right; i++)
            {
                arr[d++]=matrix[top][i];
            }
            top++;
            for (int i = top; i <= bottom; i++)
            {
                arr[d++]=matrix[i][right];
            }
            right--;
            if (top <= bottom)
            {
                for (int i = right; i >= left; i--)
                {
                    arr[d++]=matrix[bottom][i];
                }
                bottom--;
            }
            if (left <= right)
            {
                for (int i = bottom; i >= top; i--)
                {
                    arr[d++]=matrix[i][left];
                }
                left++;
            }
        }
        return arr;
    }
}






