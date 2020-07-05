package com.designpattern.test.first_section;

import com.designpattern.study.abstract_factory.FactoryProducer;
import com.designpattern.study.abstract_factory.interfaces.IAbstractFactory;
import com.designpattern.study.abstract_factory.interfaces.IProduct;
import com.designpattern.study.etc.Constants;
import com.designpattern.study.singleton.SingletonLazy;

public class MacActivity {
    public MacActivity(){
        System.out.println("==============================================");
        System.out.println("Start Activity :: Mac Activity Class");
        init();
    }

    public void init(){
        JsonReader reader = new JsonReader();
        reader.read("\\Users\\KSU\\Desktop\\Design_Pattern\\resources\\test_configuration_2");

        ConfigVO config = (ConfigVO) SingletonLazy.getInstance().get(Constants.Keys.KEY_CONFIGURATION);
        SingletonLazy.getInstance().print(Constants.Keys.KEY_CONFIGURATION);

        String os = config.getOs();
        String platform = config.getTargetPlatform();

        IAbstractFactory factory =  FactoryProducer.getFactory(os);
        IProduct product = factory.getInstance(platform);
        product.print();
    }
}
