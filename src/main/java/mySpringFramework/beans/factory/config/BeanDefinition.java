package mySpringFramework.beans.factory.config;

import mySpringFramework.beans.PropertyValues;

public class BeanDefinition {
    private Class beanClass;
    private PropertyValues propertyValues;
    private String initMethodName;
    private String destroyMethodName;

    //无属性传递的定义构造函数
    public BeanDefinition(Class bean) {
        this.beanClass = bean;
        this.propertyValues = new PropertyValues();
    }

    //带属性传递的定义构造函数
    public BeanDefinition(Class bean, PropertyValues propertyValues) {
        this.beanClass = bean;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public String getInitMethodName() {
        return initMethodName;
    }

    public void setInitMethodName(String initMethodName) {
        this.initMethodName = initMethodName;
    }

    public String getDestroyMethodName() {
        return destroyMethodName;
    }

    public void setDestroyMethodName(String destroyMethodName) {
        this.destroyMethodName = destroyMethodName;
    }
}
