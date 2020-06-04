package uk.co.mycoffeeapp.CoffeeContnet;

import java.util.ArrayList;

public class Product
{

    private int itemID;
    private String name;
    private int image;
    private String description;
    private double cost;

    public Product(int itemID, String name, int image, String description, double cost) {
        this.itemID = itemID;
        this.name = name;
        this.image = image;
        this.description = description;
        this.cost = cost;
    }
    public int GetProductID()
    {
        return itemID;
    }
    public int SetProductID(int itemID)
    {
        this.itemID = itemID;
        return itemID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getImage()
    {
        return image;
    }

    public void setImage(int image)
    {
        this.image = image;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }



    public void setItemid(int itemid)
    {
        this.itemID = itemid;
    }
}
