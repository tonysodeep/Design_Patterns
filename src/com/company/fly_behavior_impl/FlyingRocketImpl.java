package com.company.fly_behavior_impl;

import com.company.duck_behavior.IFlying;

public class FlyingRocketImpl implements IFlying {
    @Override
    public void fly() {
        System.out.println("Toi dang bay bang ten lua");
    }
}
