package org.example;

public class Main {
    public static void main(String[] args) {
        int seconds = convert(2);
        System.out.println(seconds);
    }
    public static int convert(int minutes){
        return 60*minutes;
    }
}