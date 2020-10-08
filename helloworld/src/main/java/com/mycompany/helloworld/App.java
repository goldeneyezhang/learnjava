package com.mycompany.helloworld;

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
        fruits[0] = new Fruit();
        fruits[0] = new Orange();
    }
    public void pupAge()
    {
    	int age=0;
    	age=age+7;
    	System.out.println("小狗的年龄是:"+age);
    }
}
