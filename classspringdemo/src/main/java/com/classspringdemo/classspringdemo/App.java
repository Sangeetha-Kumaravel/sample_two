package com.classspringdemo.classspringdemo;

/**
 * Hello world!
 *
 */
public class App 
{
	static int a = 10;
    public static void main( String[] args )
    {
        System.out.println( a );
        System.out.println( App.a );
        App app = new App();
        System.out.println(app.a);
        System.out.println(new App().a);
        
        
        System.out.println( Alien.b );
        Alien alien = new Alien();
        System.out.println(alien.b);
        System.out.println(new Alien().b);
    }
}
