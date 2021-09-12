package com.company;

import com.company.duck_behavior.IFlying;
import com.company.duck_behavior.IQuacking;

public class Duck {
    private IFlying iFlying;
    private IQuacking iQuacking;

    public Duck(IFlying iFlying, IQuacking iQuacking) {
        this.iFlying = iFlying;
        this.iQuacking = iQuacking;
    }

    public void display(){
        System.out.println("Toi la mot con vit display o dang string");
    }
    public void fly(){
        this.iFlying.fly();
    }
    public void quack(){
        this.iQuacking.quack();
    }

}
