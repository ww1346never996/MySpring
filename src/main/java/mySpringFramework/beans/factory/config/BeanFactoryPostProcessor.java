package mySpringFramework.beans.factory.config;

import mySpringFramework.beans.BeansException;
import mySpringFramework.beans.factory.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {
    //在所有BeanDefinition加载完成后，实例化bean对象之前提供beanDefinition的修改
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
