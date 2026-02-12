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
    public void checkBugs(){
        System.out.println(
                " no"
        );
    }

    public void pmdcheck(){
        try {
            int a=20;
            int ans=a/0;
            System.out.println(ans);
        }catch (Exception e){
            System.out.println("no worries");
        }
    }
}
