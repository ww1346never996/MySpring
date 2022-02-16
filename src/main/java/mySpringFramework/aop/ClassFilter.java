package mySpringFramework.aop;

public interface ClassFilter {
    //类匹配类用于找到给定的接口和目标类
    boolean matches(Class<?> clazz);
}
