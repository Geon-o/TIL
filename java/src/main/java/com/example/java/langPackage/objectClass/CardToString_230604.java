package com.example.java.langPackage.objectClass;

import java.util.Objects;

public class CardToString_230604 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        /**
         * toString 오버라이딩 전 결과
         * com.example.java.langPackage.objectClass.Card@27973e9b
         * com.example.java.langPackage.objectClass.Card@312b1dae
         *
         * toString 오버라이딩 후 결과
         * kind: SPACE, number: 1
         * kind: SPACE, number: 1
         */
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println(c1.equals(c2));

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

    }
}

class Card {
    String kind;
    int number;

    Card(){
        this("SPACE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    /**
     * equals를 오버라이딩하면 hashCode도 오버라이딩
     * @return
     */
    public int hashCode() {
        return Objects.hash(kind, number); //가변인자
    }

    public boolean equals(Object object) {

        if (!(object instanceof Card)) {
            return false;
        }

        Card c = (Card) object;
        return this.kind.equals(c.kind) && this.number == c.number;
    }

    /**
     * Object 클래스의 toString()을 오버라이딩
     */
    public String toString() {
        return "kind: " + kind + ", number: " + number;
    }
}
