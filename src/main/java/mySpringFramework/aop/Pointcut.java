package mySpringFramework.aop;

/**
 * 切入点接口，定义用于获取ClassFilter、MethodMatcher的两个类
 */

public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
