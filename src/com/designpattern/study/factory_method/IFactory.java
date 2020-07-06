package com.designpattern.study.factory_method;

import com.designpattern.study.abstract_factory.interfaces.IProduct;

public interface IFactory {
    public IProduct create(String type);
}
