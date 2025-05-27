package com.atria.day7.abstraction;

public abstract class Shape 
{
protected float area;
abstract void calArea();//abstract method

void show()//non abstract method
{
	System.out.println("the area is:"+area);
}

}
