package mySpringFramework.beans.factory;

public interface DisposableBean {
    //摧毁方法
    void destroy() throws Exception;
}
