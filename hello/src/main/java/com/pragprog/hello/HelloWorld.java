package com.pragprog.hello;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloWorld implements BundleActivator {
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Hello World!");
    }

    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Goodbye World!");
    }
}
