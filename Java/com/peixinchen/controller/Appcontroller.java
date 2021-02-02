package com.peixinchen.controller;

import com.peixinchen.model.Person;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: madala
 * Date: 2021-01-31;   Time: 20:38
 */
public class Appcontroller {
    public void service(){
        Person person = new Person(1,"hello");
        System.out.println(person);
    }
}
