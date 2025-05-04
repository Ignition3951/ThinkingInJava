package com.utk.design.pattern.factory;

class Factories {

    static void serviceConsumer(ServiceFactory serviceFactory){
        Service service = serviceFactory.getService();
        service.method1();
        service.method2();
    }
    public static void main(String[] args) {
        serviceConsumer(Implementation1.SERVICE_FACTORY);
        serviceConsumer(Implementation2.SERVICE_FACTORY);
    }
}
