package com.example.java.langPackage.objectClass;

public class StringEx1_230607 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1);
        System.out.println(str2);

        //객체의 위치로 비교
        //String 비교시 equals사용
        System.out.println(str1 == str2);

        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println(str3);
        System.out.println(str4);

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}
