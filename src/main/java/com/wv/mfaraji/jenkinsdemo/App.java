package com.wv.mfaraji.jenkinsdemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        if(args.length > 0) {
            sayHello(args[0]);
        }
    }

    public static void sayHello(String name) {
        System.out.println("Hi " + name + "!");
    }
}
