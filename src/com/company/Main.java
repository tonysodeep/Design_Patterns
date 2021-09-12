package com.company;

import com.company.fly_behavior_impl.FlyingNoFlyImpl;
import com.company.quack_behavior_impl.QuackingEcEcImpl;

public class Main {

    public static void main(String[] args) {
	    Duck rubberDuck = new Duck(new FlyingNoFlyImpl(),new QuackingEcEcImpl());
	    rubberDuck.display();
	    rubberDuck.fly();
	    rubberDuck.quack();
    }
}
