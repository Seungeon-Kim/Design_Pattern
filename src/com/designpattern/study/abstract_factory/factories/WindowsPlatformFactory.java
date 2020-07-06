package com.designpattern.study.abstract_factory.factories;

import com.designpattern.study.abstract_factory.interfaces.IAbstractFactory;
import com.designpattern.study.abstract_factory.interfaces.IProduct;
import com.designpattern.study.abstract_factory.products.AndroidProduct;
import com.designpattern.study.abstract_factory.products.WindowsPProduct;
import com.designpattern.study.etc.Constants;

public class WindowsPlatformFactory implements IAbstractFactory {
    @Override
    public IProduct getProduct(String platform) {
        switch(platform){
            case Constants.Platforms.PLATFORM_WINDOWS: return new WindowsPProduct();
            case Constants.Platforms.PLATFORM_ANDROID: return new AndroidProduct();
        }
        return null;
    }
}
