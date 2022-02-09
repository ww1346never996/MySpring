package mySpringFramework.beans.factory.config;

import mySpringFramework.beans.BeansException;
import mySpringFramework.beans.factory.BeanFactory;

public interface AutowireCapableBeanFactory extends BeanFactory {

    //执行BeanPostProcessors接口实现类的postProcessBeforeInitialization方法
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    //执行BeanPostProcessors接口实现类的postProcessAfterInitialization方法
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;
}