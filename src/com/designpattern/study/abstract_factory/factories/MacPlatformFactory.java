package com.designpattern.study.abstract_factory.factories;

import com.designpattern.study.abstract_factory.interfaces.IAbstractFactory;
import com.designpattern.study.abstract_factory.interfaces.IProduct;
import com.designpattern.study.abstract_factory.products.IosProduct;
import com.designpattern.study.abstract_factory.products.MacProduct;
import com.designpattern.study.etc.Constants;

public class MacPlatformFactory implements IAbstractFactory {
    @Override
    public IProduct getProduct(String platform) {
        switch(platform){
            case Constants.Platforms.PLATFORM_MAC: return new MacProduct();
            case Constants.Platforms.PLATFORM_IOS: return new IosProduct();
        }
        return null;
    }
}
