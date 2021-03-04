package com.company;

import com.company.my_classes.MyFirstClass;
import com.company.my_classes.MySecondClass;
import com.company.my_classes.MyThirdClass;

public class Main {

    public static void main(String[] args) {
        MyFirstClass myFirstClass = new MyFirstClass();
        MySecondClass mySecondClass = new MySecondClass();
        MyThirdClass myThirdClass = new MyThirdClass();

        System.out.println("class 1 implement interface 1");
        System.out.println(myFirstClass.getMyFirstVariable());
        System.out.println("class 2 extend class 1");
        mySecondClass.mySecondMethod();
        System.out.println("class 3 extend abstract class");
        myThirdClass.myFirstMethod();
        myThirdClass.setMySecondVariable("My third variable");
        myThirdClass.myFirstMethod();
        System.out.println(myThirdClass.MyFourthMethod("fourth"));


    }
}
