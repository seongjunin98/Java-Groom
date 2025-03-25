package com.seongjun.scetion01.list.run;

import java.util.Stack;

public class Application3 {

    public static void main(String[] args){

        /* 목표. Stack에 대해 이해하고 사용할 있다. */
        /*  Stack
         *  Stack은 리스트 계열 클래스의 Vector 클래스를 상속받아 구현하였다.
         *  스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
         *  후입선출(LIFO - Last Input First Out)방식의 자료 구조라 불린다.
         * */

        Stack<Integer> integerStack = new Stack<>();

        /* Stack에 값을 넣을 때는 push() 메소드를 이용한다. */
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);
    }
}
