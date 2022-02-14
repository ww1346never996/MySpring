package mySpringFramework.beans.factory;

import mySpringFramework.beans.BeansException;
import mySpringFramework.beans.factory.config.AutowireCapableBeanFactory;
import mySpringFramework.beans.factory.config.BeanDefinition;
import mySpringFramework.beans.factory.config.BeanPostProcessor;
import mySpringFramework.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}