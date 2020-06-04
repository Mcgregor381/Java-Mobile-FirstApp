package uk.co.mycoffeeapp.CoffeeContnet;

import java.util.ArrayList;

public class Coffeeobj
{
    ArrayList coffee = new ArrayList<Coffeeobj>();

    //database kinda
    // Types of coffee
    Coffeeobj type1 = new Coffeeobj(1,"ameracano","imgpath","tastey",2.99);
    Coffeeobj type2 = new Coffeeobj(2,"latty","imgpath","milky",4.99);

    public void setCoffee(ArrayList coffee)
    {
        coffee.add(type1);
        coffee.add(type2);
    }

    private int itemID;
    private String name;
    private String image;
    private String description;
    private double cost;

    public Coffeeobj(int itemid, String name, String image, String description, double cost) {
        this.itemID = itemid;
        this.name = name;
        this.image = image;
        this.description = description;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getItemid()
    {
        itemID = hashCode();
        return itemID;
    }

    public void setItemid(int itemid) {
        this.itemID = itemid;
    }




    @Override
    public int hashCode()
    {
        return super.hashCode();
    }


    ArrayList arrayListDemo = new ArrayList();

}
