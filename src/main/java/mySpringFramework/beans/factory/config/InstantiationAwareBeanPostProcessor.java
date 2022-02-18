package mySpringFramework.beans.factory.config;

import mySpringFramework.beans.BeansException;
import mySpringFramework.beans.PropertyValues;

public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {


    //在Bean对象执行初始化方法之前，执行此方法
    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

    //在Bean对象实例化完成后，设置属性操作之前执行此方法
    PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName) throws BeansException;


}
