package com.pragprog.hello.service.impl;

import com.pragprog.hello.service.HelloService;

/**
 * Created by IntelliJ IDEA.
 * User: berinle
 * Date: Sep 22, 2010
 * Time: 2:11:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloServiceImpl implements HelloService {
    public String getHelloMessage() {
        return "Bonjour!";
    }

    public String getGoodbyeMessage() {
        return "Arrivederci!";
    }
}
