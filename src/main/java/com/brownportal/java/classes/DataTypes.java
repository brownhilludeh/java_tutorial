package com.brownportal.java.classes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DataTypes {
    private boolean is_active = false;
    //delclaration
    int x;

    /**
     * Getting started
     * 
     * @param  Datatypes
     * @return Datatypes
     * @author Brownhill U
     * @since Dec 25
     */
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
        System.out.println("Hello " + name);

    }


    /**
     * Getting started
     * 
     * @param  varibles
     * @return string
     * @author Brownhill U
     * @since Dec 25
     */
    public void variables(){
        System.out.println("Variable");

        String w = "water";
        String k = "Kool-aid";
        String temp;

        // switching variables
        temp = w;
        w = k;
        k = temp;

        System.out.println("w: " + w);
        System.out.println("k: " + k);

    }


    /**
     * Getting started
     * 
     * @param  scanner
     * @return string
     * @author Brownhill U
     * @since Dec 25
     */
    public void usingScanner(){
        Scanner input = new Scanner(System.in);

        System.out.println("What is my name?");
        String myName = input.nextLine();

        System.out.println("How old are you?");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("What is your favorite food?");
        String food = input.nextLine();

        System.out.println("Hello " + myName);
        System.out.println("You are " + age + " years old");
        System.out.println(food + " is ypour favorite food");

    }

    /**
     * Getting started
     * 
     * @param  operators
     * @return string
     * @author Brownhill U
     * @since Dec 25
     */
    public void operators(){
        int friends = 10;
        friends = friends - 1;
        System.out.println(friends);
        friends = friends / 3;
        System.out.println(friends);
        friends = friends + 1;
        System.out.println(friends);
        friends = friends  * 3;
        System.out.println(friends);
        friends = friends % 3;
        friends++;
        System.out.println(friends);
        friends--;
        System.out.println();
    }

    /**
     * Getting started
     * 
     * @param  prompt
     * @return string
     * @author Brownhill U
     * @since Dec 25
     */
    public void jOptionPane(){
        String name = JOptionPane.showInputDialog("Enter another name");
        JOptionPane.showMessageDialog(null, name, name, x);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age again: "));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old", name, age);

    }
}
