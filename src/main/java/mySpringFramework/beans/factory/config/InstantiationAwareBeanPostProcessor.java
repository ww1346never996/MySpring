package mySpringFramework.beans.factory.config;

import mySpringFramework.beans.BeansException;

public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {


    //在Bean对象执行初始化方法之前，执行此方法
    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

}
