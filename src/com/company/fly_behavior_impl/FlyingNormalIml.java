package com.company.fly_behavior_impl;

import com.company.duck_behavior.IFlying;

public class FlyingNormalIml implements IFlying {
    @Override
    public void fly() {
        System.out.println("toi dang bay bang cach dap canh");
    }
}
