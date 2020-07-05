package com.designpattern.study.singleton;

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
