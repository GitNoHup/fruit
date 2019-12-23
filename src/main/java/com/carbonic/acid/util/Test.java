package com.carbonic.acid.util;

public class Test {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = "ab" + "c";
        System.out.println("a == b " + (a == b));//true
        System.out.println("a == c " + (a == c));//false
        System.out.println("a == d " + (a == d));//true
        System.out.println("b == c " + (b == c));//false
        System.out.println("b == d " + (b == d));//true
        System.out.println("c == d " + (c == d));//false
        System.out.println("-----------------");
        System.out.println("abc" == ("ab" + "c"));//true
        System.out.println("-----------------");
        String e = c.intern();//将new出来的字符串对象加入字符串常量池
        System.out.println(a == e);//true
    }
}
