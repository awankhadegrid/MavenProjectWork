package com.practice;

/**
 * Hello world!
 *
 */

// we use this command to run the java program this is without executable plugin
    // -------- java -cp target/classes com.practice.App
public class App
{
    public static String gethello(){
        return "Hello maven project";
    }

    public static void main(String[] args) {
        System.out.println("hello for exec command");
    }

    public int testMethod(){
        return 10;
    }
}
