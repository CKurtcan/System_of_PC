package com.CK.lesson015.PC;

import com.CK.lesson015.PC.entity.Ram;

public class Runner {
    public static void main(String[] args) {

        Ram ram = new Ram("Ram Portal",
                4.25,
                "Mother board",
                "DDR4");
        System.out.println(ram);
    }

}
