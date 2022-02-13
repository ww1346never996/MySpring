package mySpringFramework.beans.factory;

import mySpringFramework.beans.BeansException;

public interface BeanClassLoaderAware extends Aware{
    void setBeanClassLoader(ClassLoader classLoader);
}
