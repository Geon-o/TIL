package com.example.java.langPackage.objectClass;

public class StringEx6_230612 {
    public static void main(String[] args) {
        int iVal = 100;
//        String strVal = String.valueOf(iVal);
        String strVal = iVal + "";

        double dVal = 200.0;
        String strVal2 = dVal + "";

        double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

        //많은 문자열을 더할경우에는 String.join 권장 -> 성능향상
        System.out.println(String.join("", strVal, " + ", strVal2, " = ") + sum);
        //여러 문자열을 계속해서 더하는건 성능이슈 발생할 수 있음
        System.out.println(strVal + " + " + strVal2 + " = " + sum2);
    }
}
