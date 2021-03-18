package com.company.Porterfield;

public class Main {

    public static void main(String[] args) {
        Person ppl1 = new Person("Bill", "Bill@gmail.com");
        Buisness ppl11 = new Buisness("Bill", "Bill@gmail.com", "614-555-5555");

        ppl11.display();
        ppl1.display();
    }
}
