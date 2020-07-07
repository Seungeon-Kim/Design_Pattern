package com.designpattern.study.singleton;

// 장점 : 객체가 처음 사용할 경우에만 synchronized, 유일성을 보장하면서 SingletonLazySync 보다 높은 성능을 가질 수 있음
// 단점 : 그래도 결국엔 synchronized 성능 저하가 있을 수 있음
public class    SingletonLazySyncDCL {
    private static SingletonLazySyncDCL instance = null;

    public static SingletonLazySyncDCL getInstance(){
        if (null == instance) {
            synchronized (SingletonLazySyncDCL.class){
                if(null == instance) instance = new SingletonLazySyncDCL();
            }
        }

        return instance;
    }

    public void print(){
        System.out.print("Singleton Print");
    }
}
