package com.mycompany.helloworld;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! 张一博" );
        App test=new App();
        test.pupAge();
        Fruit[] fruits = new Apple[10];
        fruits[0] = new Apple();
        fruits[1] = new Jonathan();
        try {
            fruits[0] = new Fruit();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            fruits[0] = new Orange();
        } catch (Exception e) {
            System.out.println(e);
        }
        //协变
        List<? extends Apple> appleList = new ArrayList<Jonathan>();
        //appleList.add(new Jonathan());
        //逆变
        List<? super Fruit> fruitList = new ArrayList<Fruit>();       fruitList.add(new Apple());

        fruitList.add(new Jonathan());

        fruitList.add(new Fruit());
        

    }
    public void pupAge()
    {
    	int age=0;
    	age=age+7;
    	System.out.println("小狗的年龄是:"+age);
    }
}
