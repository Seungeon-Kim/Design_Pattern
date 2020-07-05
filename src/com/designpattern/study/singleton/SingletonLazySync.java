package com.designpattern.study.singleton;

// 장점 : 멀티 쓰레드 환경에서 사용 유무에 대한 메모히 낭비 없이 객체의 유일성을 보장해줌
// 단점 : synchronized 사용으로 인한 성능 저하
public class SingletonLazySync {
    private static SingletonLazySync instance = null;

    public static synchronized SingletonLazySync getInstance(){
        if (null == instance) instance = new SingletonLazySync();

        return instance;
    }

    public void print(){
        System.out.print("Singleton Print");
    }
}
