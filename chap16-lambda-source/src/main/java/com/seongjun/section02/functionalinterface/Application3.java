package com.seongjun.section02.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Application3 {


    public static void main(String[] args) {

        /* 목표. 표준 함수적 인터페이스 중 Function에 대해 이해하고 사용할 수 있다. */
        /* Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다. (매개변수를 리턴값으로 매핑하는 역할) */
        /* 목차. 1. Function<T, R>#apply(T t) : R : 객체 T를 R로 매핑한다. */
        Function<String, Integer> function = (str) -> Integer.parseInt(str);
        String strValue = "12345";
        System.out.println(function.apply(strValue) + " : " + function.apply(strValue).getClass().getName());

        /* 목차. 2. BiFunction<T, U, R>#apply(T t, U u) : R : 객체 T와 U를 R로 매핑한다. */
        BiFunction<String, String, Integer> biFunction = (str1, str2) -> Integer.parseInt(str1) + Integer.parseInt(str2);
    }
}
