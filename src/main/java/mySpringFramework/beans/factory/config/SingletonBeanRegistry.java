package mySpringFramework.beans.factory.config;

public interface SingletonBeanRegistry {
    //定义获取单例对象的接口
    Object getSingleton(String beanName);
}
