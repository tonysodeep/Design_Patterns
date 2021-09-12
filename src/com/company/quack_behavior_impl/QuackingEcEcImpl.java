package com.company.quack_behavior_impl;

import com.company.duck_behavior.IQuacking;

public class QuackingEcEcImpl implements IQuacking {
    @Override
    public void quack() {
        System.out.println("Toi dang noi ec ec");
    }
}
