package mySpringFramework.beans.factory.config;

import mySpringFramework.beans.BeansException;

public interface BeanPostProcessor {
    //在Bean对象初始化之前调用此方法
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    //在Bean对象初始化后调用此方法
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
