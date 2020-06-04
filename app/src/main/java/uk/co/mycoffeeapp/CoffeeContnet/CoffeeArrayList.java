package uk.co.mycoffeeapp.CoffeeContnet;

import java.util.* ;

public class CoffeeArrayList
{
    ArrayList<Coffeeobj> coffee = new ArrayList<Coffeeobj>();

    //database kinda
    // Types of coffee
    Coffeeobj type1 = new Coffeeobj(1,"ameracano","imgpath","tastey",2.99);
    Coffeeobj type2 = new Coffeeobj(2,"latty","imgpath","milky",4.99);

    public void setCoffee(ArrayList<Coffeeobj> coffee)
    {
        coffee.add(type1);
        coffee.add(type2);
    }
}
