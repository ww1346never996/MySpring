package mySpringFramework.beans.factory;

public interface InitializingBean {
    //Bean处理属性填充后调用
    void afterPropertiesSet() throws Exception;
}
