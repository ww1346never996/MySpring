package mySpringFramework.context;

import mySpringFramework.beans.factory.HierarchicalBeanFactory;
import mySpringFramework.beans.factory.ListableBeanFactory;
import mySpringFramework.core.io.ResourceLoader;

public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}

