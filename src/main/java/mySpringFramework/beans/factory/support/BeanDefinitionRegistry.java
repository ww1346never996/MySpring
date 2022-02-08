package mySpringFramework.beans.factory.support;

import mySpringFramework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    //向注册表中注册BeanDefinition
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
