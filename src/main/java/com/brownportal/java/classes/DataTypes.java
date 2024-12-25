package com.brownportal.java.classes;

public class DataTypes {
    private boolean is_active = false;
    //delclaration
    int x;

    public void datatype(){
        // primitive boolean 1 bit true or false 
        // primitive byte 1 byte -128 to 127
        // primitive short 2 bytes -32,768 to 32,767
        // primitive int 4 bytes 2billion
        // primitive flost 4 bytes fractions 7 digits
        // primitive double 8 bytes  fractions 15 digts
        // primitive char 2 bytes ascii
        //refrence  String infiniti 

        long longs = 1233455677809685L;

        float floats = 3.5938456f;

        boolean z = true;

        char symbol = '@';
        String name = "Brownhill Udeh";
        //assingment 
        x = 123;
        //initialisation 
        int y = 123;

        System.out.println(x + y);

        System.out.println(longs);
        System.out.println(floats);
        System.out.println(is_active);
        System.out.println(z);
        System.out.println(symbol);

    }
}
