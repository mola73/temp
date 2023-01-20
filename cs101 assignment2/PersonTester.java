/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2cs101;

/**
 *
 * @author muham
 */
public class PersonTester {

    public static void numbers() {
        final int alivenum = Person.numberLiving();
        final int deadnum = Person.numberDead();
        final int total = deadnum + alivenum;
        System.out.printf("There are %d alive people and %d dead people of a total of %d%n", alivenum, deadnum, total);
    }

    public static void main(String[] args) {
        Person a = new Person("Abdullah ibn Masood", true);
        System.out.println("Abdullah ibn Masood says hi");
        System.out.println();
        a.sayHello();
        numbers();
        System.out.println();

        Person b = new Person("Khabbab ib al-arat", true);
        System.out.println("Khabbab is created");
        System.out.println("Khabbab ib al-arat says hi");
        b.sayHello();
        System.out.println("Everyone says hi");
        Person.allSayHello();
        numbers();
        System.out.println();

        Person e = new Person("Umm Anmar");
        System.out.println("Umm Anmar is created");
        System.out.println("Umm Anmar  says hi");
        e.sayHello();
        System.out.println("Everyone says hi");
        Person.allSayHello();
        numbers();
        System.out.println();

        System.out.println("Umm Anmar used to torture Khabbab so whe was struck with death due to a brain disease, she will not be missed");
        e.die();
        numbers();
        Person.allSayHello();
        System.out.println();

        System.out.println("Umm Anmar tried to kill Khabbab from her grave but it did not work because she is locked in her graave");
        e.murder(b);
        numbers();
        Person.allSayHello();
        System.out.println();

        Person d = new Person("Abu jahl");
        System.out.println("Abu jahl is created");
        System.out.println("Abu jahl  says hi");
        d.sayHello();
        System.out.println("Everyone says hi");
        Person.allSayHello();
        numbers();
        System.out.println();

        System.out.println("Abu Jahl tries to kill Abdullah ibn Massood by beating him unconcious but is not succesfull");

        System.out.println("Abdullah ibn Masood later slashes the neck of  Abu Jahl as recompense for almost stomping him to death");
        a.murder(d);
        numbers();
        Person.allSayHello();

        System.out.println(" Since Abdullah ibn Masood and Khabbab ibn al arat are good freinds they lived long peaceful lives until they both died");
        a.die();
        b.die();
        numbers();
        Person.allSayHello();

        System.out.println("THE END");

    }
}
