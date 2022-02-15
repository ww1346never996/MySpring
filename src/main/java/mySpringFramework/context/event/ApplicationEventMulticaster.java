package mySpringFramework.context.event;

import mySpringFramework.context.ApplicationEvent;
import mySpringFramework.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    //添加监听器
    void addApplicationListener(ApplicationListener<?> listener);

    //移除监听器
    void removeApplicationListener(ApplicationListener<?> listener);

    //广播事件
    void multicastEvent(ApplicationEvent event);

}
