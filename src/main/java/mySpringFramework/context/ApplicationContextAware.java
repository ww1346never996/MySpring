package mySpringFramework.context;

import mySpringFramework.beans.BeansException;
import mySpringFramework.beans.factory.Aware;
import mySpringFramework.context.ApplicationContext;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
