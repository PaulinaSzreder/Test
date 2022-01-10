package com.company;

public class Main {

    public static void main(String[] args) {

        for(int i = 0; i <=50; i+=1){
            System.out.println("Progrogram działa. Foobar");
            System.out.println(i);
            pause(1000);
            System.out.flush();
			System.out.println("Coś");
        }
    }


    public static void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
