package com.step;

public class App
{
    public static void main(String[] args)
    {
        if (args.length == 0) {
            System.out.println("Hello, Stranger!");
        } else {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        }
    }
}