package com.example.girl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GirlApplication {

    public static void main(String[] args) {
        //SpringApplication.run(GirlApplication.class, args);

        int[] a1 = {1,2,3,4,5};
        int[] a2;
        a2 = a1;
        for(int i=0; i<a2.length; i++) {
            a2[i] = a2[i] + 1;
        }

        for(int j=0; j<a1.length; j++) {
            System.out.println("a1[" + j + "] = " + a1[j]);;
        }
    }
}
