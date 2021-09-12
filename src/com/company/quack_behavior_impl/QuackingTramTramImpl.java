package com.company.quack_behavior_impl;

import com.company.duck_behavior.IQuacking;

public class QuackingTramTramImpl implements IQuacking {
    @Override
    public void quack() {
        System.out.println("toi dang keu tram tram");
    }
}
