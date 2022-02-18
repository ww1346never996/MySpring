import bean.IUserService;
import bean.UserService;
import bean.UserServiceBeforeAdvice;
import bean.UserServiceInterceptor;
import mySpringFramework.aop.AdvisedSupport;
import mySpringFramework.aop.ClassFilter;
import mySpringFramework.aop.MethodMatcher;
import mySpringFramework.aop.TargetSource;
import mySpringFramework.aop.aspectj.AspectJExpressionPointcut;
import mySpringFramework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import mySpringFramework.aop.framework.ProxyFactory;
import mySpringFramework.aop.framework.ReflectiveMethodInvocation;
import mySpringFramework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
import mySpringFramework.beans.BeansException;
import mySpringFramework.beans.factory.config.BeanPostProcessor;
import mySpringFramework.context.support.ClassPathXmlApplicationContext;
import org.aopalliance.intercept.MethodInterceptor;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class ApiTest {

    @Test
    public void test_autoProxy() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

}
