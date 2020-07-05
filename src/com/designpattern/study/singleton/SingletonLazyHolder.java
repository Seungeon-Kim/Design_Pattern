package com.designpattern.study.singleton;

/* 장점 : JVM에게 객체의 초기화를 떠님기는 방식으로, 멀티 스레드 환경에서도 객체의 유일성 보장.
         Syncronized 사용을 하지않아 성능 저하를 방지할 수 있다.
         가장 추천되는 방식의 Singleton Pattern
*/
public class SingletonLazyHolder {
    public static SingletonLazyHolder getInstance(){
        return LazyHolder.INSTANCE;
    }
    public void print(){
        System.out.print("Singleton Print");
    }

    private static class LazyHolder{
        private static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }
}
