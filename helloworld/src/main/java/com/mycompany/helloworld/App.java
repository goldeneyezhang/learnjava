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
    }
    public void pupAge()
    {
    	int age=0;
    	age=age+7;
    	System.out.println("小狗的年龄是:"+age);
    }
}
