package com.seongjun.section03.map.run;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application1 {

    public static void main(String[] args) {

        /* 목표. Map의 자료구조에 대해 이해하고 HashMap을 이용할 수 있다. */
        /*  Map 인터페이스의 특징
         *  Collection 인터페이스와는 다른 저장 방식을 가진다.
         *  키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
         * */

        HashMap hmap = new HashMap();
//        Map hmap2 = new HashMap();

        /*  키와 값 쌍으로 저장한다.
         *  키와 값 둘다 반드시 객체여야 한다.
         * */
        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        System.out.println("hmap : " + hmap);

        /* 키는 중복 저장 되지 않음(set) : 최근 키로 override됨(덮어씀) */
        hmap.put(12, "yellow banana");
        System.out.println("hmap : " + hmap);

        /* 값 객체 저장은 중복 저장됨 */
        hmap.put(11, "yellow banana");
        hmap.put(9, "yellow banana");
        System.out.println("hmap : " + hmap);

        /* 값 객체의 내용을 가져올 때 */
        System.out.println("키 9에 대한 객체 : " + hmap.get(9));

        /* 키 값을 가지고 삭제를 처리할 때 */
        hmap.remove(9);
        System.out.println("hmap : " + hmap);

        /* 저장된 객체 수를 확인할 때 */
        System.out.println("hmap에 저장된 객체 수 : " + hmap.size());

        HashMap<String, String> hmap2 = new HashMap<>();

        hmap2.put("one", "java 8");
        hmap2.put("two", "oracle 11g");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html5");
        hmap2.put("five", "css3");

        /* 목차. 1. keySet()을 이용해서 키만 따로 set으로 만들고, iterator()로 키에 대한 목록 만듦  */
//		Set<String> keys = hmap2.keySet();
//		Iterator<String> keyIter = keys.iterator();

        Iterator<String> keyIter = hmap2.keySet().iterator();

        while (keyIter.hasNext()){
            String  key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println();

        /* 목차. 2. 저장된 value객체들만 values()로 Collection으로 만듦 */
        Collection<String> values = hmap2.values();

        /* 목차. 2-1. Iterator()로 목록 만들어서 처리 */
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()){
            System.out.println(valueIter.next());
        }

        System.out.println();

        /* 목차. 2-2. 배열로 만들어서 처리 */
        Object[] valueArr = values.toArray();
        for(int i =0; i< valueArr.length; i++){
            System.out.println(i + " : " + valueArr[i]);
        }

        System.out.println();

        /* 목차. 3. Map의 내부클래스인 EntrySet을 이용 : entrySet() */
        Set<Map.Entry<String, String>> set = hmap2.entrySet();
        /* Entry : 키 객체와 값 객체를 쌍으로 묶은 것 */
        Iterator<Map.Entry<String, String>> entryIter = set.iterator();
        while (entryIter.hasNext()){
            Map.Entry<String, String> entry = entryIter.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
