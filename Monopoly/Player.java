import java.util.*;
import java.io.*;
//import java.jswing.*;

public class Player{
    protected String token, name;
    protected int money, initRoll, order, location;
    protected ArrayList<Property> props;
    protected boolean jail, jailCard, stillPlaying;
    //also if they have a get out of jail card?
    
    public Player (String plName, String plToken){
	money = 1500;
	props = new ArrayList<Property>();
	jail = false; 
	jailCard = false;
	stillPlaying = true;
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
    
    public int numOfColourSet(String colour){
	//returns the number of properties in a set that is held
	int count = 0;
	for (int i = 0; i < props.size(); i++) {
	    if (colour.equals(props.get(i).getColour())) {
		count++; 
	    }
	}
	return count;
    }

    public boolean buyProperty (Property land){
	if (this.money < land.startPrice){
	    this.loseMoney(land.startPrice);
	    props.add(land);
	    land.owner = this;
	    return true;
	}
	return false;
    }
	else{ 
		land.owner = this;
		props.add(land);
		this.loseMoney(land.startPrice);
	}
    
}
