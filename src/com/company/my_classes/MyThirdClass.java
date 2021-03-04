package com.company.my_classes;

import com.company.my_abstract_classes.MyFirstAbstractClass;
import com.company.my_interfaces.MyFirstInterface;

public class MyThirdClass extends MyFirstAbstractClass implements MyFirstInterface {
    public void setMySecondVariable(String secondVariable){
        mySecondVariable = secondVariable;
    }
    public String getMySecondVariable(){
        if (mySecondVariable == null) {
            return "mySecondVariable == null";
        }
        else {
            return mySecondVariable;
        }
    }

    @Override
    public void myFirstMethod() {
        System.out.println(getMySecondVariable());
    }
}
