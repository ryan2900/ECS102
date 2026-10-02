import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public MyWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pizza pizza = new Pizza();
        addObject(pizza,300,300);

        Topping topping = new Topping("Pepperoni");
        addObject(topping,150,80);
        Topping topping2 = new Topping("Mushrooms");
        addObject(topping2,300,40);
        Topping topping3 = new Topping("Olives");
        addObject(topping3,450,120);

        Topping topping4 = new Topping("Cheese");
        addObject(topping4,0,0);
        Topping topping5 = new Topping("BellPeppers");
        addObject(topping5,599,399);

        Topping topping6 = new Topping("Pepperoni");
        addObject(topping6,80,200);
        Topping topping7 = new Topping("Olives");
        addObject(topping7,520,240);
    }
}
