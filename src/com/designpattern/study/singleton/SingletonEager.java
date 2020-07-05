package com.designpattern.study.singleton;


// 장점 : 멀티 쓰레드 환경에서 객체의 유일성을 보장
// 단점 : 사용하지 않더라도, 미리 할당되어 메모리 낭비
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    public static SingletonEager getInstance(){
        return instance;
    }

    public void print(){
        System.out.print("Singleton Print");
    }
}
