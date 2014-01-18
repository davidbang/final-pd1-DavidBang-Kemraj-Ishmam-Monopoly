import java.util.*;
import java.io.*;
//import java.jswing.*;

public class Player{
    protected String token, name;
    protected int money, initRoll, order, lastRoll;
    protected Property[] props;
    protected boolean jail;
	//also if they have a get out of jail card?
    
    public Player (String plName, String plToken){
	money = 1500;
	props = new Property[28];
	jail = false; 
    }
    
    public void addMoney(int amt) {//adds money for any reason
	money = money + amt;
    }
    
    public boolean loseMoney(int amt) {//deducts money for any reason
	if (money >= amt){
	    money = money - amt;
	    return true; 
	}	    
	else
	    return false;
    }
	
    public boolean giveMoney(Player other, int amt) {//gives money from one player to another
	if (this.money >= amt){
	    this.addMoney(-amt);
	    other.addMoney(amt);
	    return true; 
	}	    
	else
	    return false;
    }

    public int getMoney() {
		return this.money;
	}
	
	public int numOfColourSet(String color){
	//returns the number of properties in a set that is held
		int count = 0;
		for (int i = 0; i < props.length; i++) {
			if (color.equals(props[i].getColour) {
				count++; 
			}
		}
		return count;
	}
}
