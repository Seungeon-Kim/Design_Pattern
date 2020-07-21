package com.designpattern.study.singleton;

import com.designpattern.test.ConfigVO;
import com.designpattern.study.etc.Constants;

import java.util.Hashtable;

// 장점 : 객체가 사용될 때, 메모리를 할당하여 낭비를 방지할 수 있음
// 단점 : 멀티 쓰레드 환경에서 객체의 유일성을 보장하지 못하는 경우가 발생
public class SingletonLazy {
    private static SingletonLazy instance = null;
    private Hashtable<String, Object> hashTable = null;

    public static SingletonLazy getInstance(){
        if (null == instance) instance = new SingletonLazy();

        return instance;
    }

    public void print(String key){
        Object obj = get(key);
        switch (key){
            case Constants.Keys.KEY_CONFIGURATION:
                System.out.println(((ConfigVO)obj).getFileName());
        }
    }

    private void init(){
        if(null == hashTable) hashTable = new Hashtable<>();
    }

    public void add(String key, Object value){
        this.init();
        hashTable.put(key, value);
    }
    public Object get(String key){
        this.init();
        if (hashTable.containsKey(key)){
            return hashTable.get(key);
        }else return null;
    }

}
