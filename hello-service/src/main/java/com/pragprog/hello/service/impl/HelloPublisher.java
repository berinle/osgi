package com.pragprog.hello.service.impl;

import com.pragprog.hello.service.HelloService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/**
 * Created by IntelliJ IDEA.
 * User: berinle
 * Date: Sep 22, 2010
 * Time: 2:19:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloPublisher implements BundleActivator {
    private ServiceRegistration registration;

    public void start(BundleContext bundleContext) throws Exception {
        registration = bundleContext.registerService(HelloService.class.getName(), new HelloServiceImpl(), null);
    }

    public void stop(BundleContext bundleContext) throws Exception {
        registration.unregister();
    }
}
