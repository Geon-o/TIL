package com.example.java.langPackage.objectClass;

public class EqualsEx1_230603 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }
    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    /**
     * Object의 equals()를 오버라이딩해서 주소가 아닌 value비교
     */
    public boolean equals(Object object) {

        /**
         * 형변환 전엔 반드시 instanceof를 사용해서 변환이 가능한지 확인
         */
        if (!(object instanceof Value)) {
            return false;
        }

        /**
         * Object에는 Value가 없기에 형변환을 해줘야함
         * */
        Value v = (Value) object;

        return this.value == v.value;
    }
}
