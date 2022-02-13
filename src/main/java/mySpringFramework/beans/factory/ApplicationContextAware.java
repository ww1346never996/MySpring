package mySpringFramework.beans.factory;

import mySpringFramework.beans.BeansException;
import mySpringFramework.context.ApplicationContext;

public interface ApplicationContextAware extends Aware{
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
