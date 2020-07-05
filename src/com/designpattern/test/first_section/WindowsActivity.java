package com.designpattern.test.first_section;

import com.designpattern.study.abstract_factory.ConfigurationProducer;
import com.designpattern.study.abstract_factory.interfaces.IProduct;
import com.designpattern.study.etc.Constants;
import com.designpattern.study.singleton.SingletonLazy;

public class WindowsActivity {
    public WindowsActivity(){
        System.out.println("==============================================");
        System.out.println("Start Activity :: Windows Activity Class");
        init();
    }
    public void init(){
        JsonReader reader = new JsonReader();
        reader.read("\\Users\\KSU\\Desktop\\Design_Pattern\\resources\\test_configuration_1");

        ConfigVO config = (ConfigVO) SingletonLazy.getInstance().get(Constants.Keys.KEY_CONFIGURATION);
        SingletonLazy.getInstance().print(Constants.Keys.KEY_CONFIGURATION);

        String os = config.getOs();
        String platform = config.getTargetPlatform();

        IProduct product = ConfigurationProducer.getFactory(os).getInstance(platform);

        product.print();
    }
}
