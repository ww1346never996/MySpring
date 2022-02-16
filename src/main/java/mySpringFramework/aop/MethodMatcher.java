package mySpringFramework.aop;

import java.lang.reflect.Method;

public interface MethodMatcher {
    //方法匹配找到目标类和方法
    boolean matches(Method method, Class<?> targetClass);
}
