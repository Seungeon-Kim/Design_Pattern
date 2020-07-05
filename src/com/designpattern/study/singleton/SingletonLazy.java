package com.designpattern.study.singleton;

// 장점 : 객체가 사용될 때, 메모리를 할당하여 낭비를 방지할 수 있음
// 단점 : 멀티 쓰레드 환경에서 객체의 유일성을 보장하지 못하는 경우가 발생
public class SingletonLazy {
    private static SingletonLazy instance = null;

    public static SingletonLazy getInstance(){
        if (null == instance) instance = new SingletonLazy();

        return instance;
    }

    public void print(){
        System.out.println("Singleton Print");
    }
}
