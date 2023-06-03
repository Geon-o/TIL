package com.example.java.langPackage.objectClass;

public class EqualsEx2_230603 {
    public static void main(String[] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if (p1 == p2) {
            System.out.println("p1 == p2: 같은 사람");
        } else {
            System.out.println("p1 == p2: 다른사람");
        }

        if (p1.equals(p2)) {
            System.out.println("p1.equals(p2): 같은사람");
        } else {
            System.out.println("p1.equals(p2): 다른사람");
        }
    }
}

class Person {
    long id;

    Person(long id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }

        return this.id == ((Person) obj).id;
    }
}

