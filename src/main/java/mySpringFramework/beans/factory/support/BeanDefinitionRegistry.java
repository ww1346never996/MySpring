package mySpringFramework.beans.factory.support;

import mySpringFramework.beans.BeansException;
import mySpringFramework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    //向注册表中注册 BeanDefinition
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);


    //使用Bean名称查询BeanDefinition
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    //判断是否包含指定名称的BeanDefinition
    boolean containsBeanDefinition(String beanName);

    //返回注册表中所有的Bean名称
    String[] getBeanDefinitionNames();
}
