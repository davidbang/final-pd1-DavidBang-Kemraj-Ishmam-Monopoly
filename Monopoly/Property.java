import java.io.*;
import java.util.*;

public class Property extends Tiles{
    int currentRent,numHouses,initRent, house1, house2, house3, house4, hotel, startPrice, mortgagePrice, housePrice;
    String name, colour;  
    boolean mortgaged;
    Player owner;
    
    public Property (String name){
		numHouses = 0;
		mortgaged = false;
		owned = false;
		if (name == "Mediterranean"){
	    startPrice = 60;
	    initRent = 2;
	    currentRent = initRent;
	    colour = "Purple";
	    housePrice = 50;
	    mortgagePrice = startPrice/2;
	    house1 = 10;
	    house2 = 30;
	    house3 = 90;
	    house4 = 160;
	    hotel = 250;
	}
		if (name == "Baltic"){
	    startPrice = 60;
	    initRent = 4;
	    currentRent = initRent;
	    colour = "Purple";
	    housePrice = 50;
	    mortgagePrice = startPrice/2;
	    house1 = 20;
	    house2 = 60;
	    house3 = 180;
	    house4 = 320;
	    hotel = 450;
	}
		if (name == "Oriental"){
	     startPrice = 100;
	    initRent = 6;
	    currentRent = initRent;
	    colour = "Light Blue";
	    housePrice = 50;
	    mortgagePrice = startPrice/2;
	    house1 = 30;
	    house2 = 90;
	    house3 = 270;
	    house4 = 400;
	    hotel = 550;
	}
		if (name == "Vermont"){
	     startPrice = 100;
	    initRent = 6;
	    currentRent = initRent;
	    colour = "Light Blue";
	    housePrice = 50;
	    mortgagePrice = startPrice/2;
	    house1 = 30;
	    house2 = 90;
	    house3 = 270;
	    house4 = 400;
	    hotel = 550;
	}
		if (name == "Connecticut"){
	      startPrice = 120;
	    initRent = 8;
	    currentRent = initRent;
	    colour = "Light Blue";
	    housePrice = 50;
	    mortgagePrice = startPrice/2;
	    house1 = 40;
	    house2 = 100;
	    house3 = 300;
	    house4 = 450;
	    hotel = 600;
	}
		if (name == "St. Charles"){
	     startPrice = 140;
	    initRent = 10;
	    currentRent = initRent;
	    colour = "Pink";
	    housePrice = 100;
	    mortgagePrice = startPrice/2;
	    house1 = 50;
	    house2 = 150;
	    house3 = 450;
	    house4 = 625;
	    hotel = 750;
	}
		if (name == "States"){
	    startPrice = 140;
	    initRent = 10;
	    currentRent = initRent;
	    colour = "Pink";
	    housePrice = 100;
	    mortgagePrice = startPrice/2;
	    house1 = 50;
	    house2 = 150;
	    house3 = 450;
	    house4 = 625;
	    hotel = 750;
	}
		if (name == "Virginia"){
	     startPrice = 160;
	    initRent = 12;
	    currentRent = initRent;
	    colour = "Pink";
	    housePrice = 100;
	    mortgagePrice = startPrice/2;
	    house1 = 60;
	    house2 = 180;
	    house3 = 500;
	    house4 = 700;
	    hotel = 900;
	}
		if (name == "St. James"){
	     startPrice = 180;
	    initRent = 14;
	    currentRent = initRent;
	    colour = "Orange";
	    housePrice = 100;
	    mortgagePrice = startPrice/2;
	    house1 = 70;
	    house2 = 200;
	    house3 = 550;
	    house4 = 750;
	    hotel = 950;
	}
		if (name == "Tennessee"){
	     startPrice = 180;
	    initRent = 14;
	    currentRent = initRent;
	    colour = "Orange";
	    housePrice = 100;
	    mortgagePrice = startPrice/2;
	    house1 = 70;
	    house2 = 200;
	    house3 = 550;
	    house4 = 750;
	    hotel = 950;
	}
		if (name == "New York"){
	     startPrice = 200;
	    initRent = 16;
	    currentRent = initRent;
	    colour = "Orange";
	    housePrice = 100;
	    mortgagePrice = startPrice/2;
	    house1 = 80;
	    house2 = 220;
	    house3 = 600;
	    house4 = 800;
	    hotel = 1000;
	}
		if (name == "Kentucky"){
			 startPrice = 220;
			initRent = 18;
			currentRent = initRent;
			colour = "Red";
			housePrice = 150;
			mortgagePrice = startPrice/2;
			house1 = 90;
			house2 = 250;
			house3 = 700;
			house4 = 875;
			hotel = 1050;
		}
		if (name == "Indiana"){
			startPrice = 220;
			initRent = 18;
			currentRent = initRent;
			colour = "Red";
			housePrice = 150;
			mortgagePrice = startPrice/2;
			house1 = 90;
			house2 = 250;
			house3 = 700;
			house4 = 875;
			hotel = 1050;
		}
		if (name == "Illinois"){
			 startPrice = 240;
			initRent = 20;
			currentRent = initRent;
			colour = "Red";
			housePrice = 150;
			mortgagePrice = startPrice/2;
			house1 = 100;
			house2 = 300;
			house3 = 750;
			house4 = 925;
			hotel = 1100;
		}
		if (name == "Atlantic"){
			 startPrice = 260;
			initRent = 22;
			currentRent = initRent;
			colour = "Yellow";
			housePrice = 150;
			mortgagePrice = startPrice/2;
			house1 = 110;
			house2 = 330;
			house3 = 800;
			house4 = 975;
			hotel = 1150;
		}
		if (name == "Ventnor"){
			startPrice = 260;
			initRent = 22;
			currentRent = initRent;
			colour = "Yellow";
			housePrice = 150;
			mortgagePrice = startPrice/2;
			house1 = 110;
			house2 = 330;
			house3 = 800;
			house4 = 975;
			hotel = 1150;
		}
		if (name == "Marvin Gardens"){
			 startPrice = 280;
			initRent = 24;
			currentRent = initRent;
			colour = "Yellow";
			housePrice = 150;
			mortgagePrice = startPrice/2;
			house1 = 120;
			house2 = 360;
			house3 = 850;
			house4 = 1025;
			hotel = 1200;
		}
		if (name == "Pacific"){
			 startPrice = 300;
			initRent = 26;
			currentRent = initRent;
			colour = "Green";
			housePrice = 200;
			mortgagePrice = startPrice/2;
			house1 = 130;
			house2 = 390;
			house3 = 900;
			house4 = 1100;
			hotel = 1275;
		}
		if (name == "North Carolina"){
			  startPrice = 300;
			initRent = 26;
			currentRent = initRent;
			colour = "Green";
			housePrice = 200;
			mortgagePrice = startPrice/2;
			house1 = 130;
			house2 = 390;
			house3 = 900;
			house4 = 1100;
			hotel = 1275;
		}
		if (name == "Pennsylvania Ave"){
			 startPrice = 320;
			initRent = 28;
			currentRent = initRent;
			colour = "Green";
			housePrice = 200;
			mortgagePrice = startPrice/2;
			house1 = 150;
			house2 = 450;
			house3 = 1000;
			house4 = 1200;
			hotel = 1400;
		}
		if (name == "Park Place"){
			 startPrice = 350;
			initRent = 35;
			currentRent = initRent;
			colour = "Blue";
			housePrice = 200;
			mortgagePrice = startPrice/2;
			house1 = 175;
			house2 = 500;
			house3 = 1100;
			house4 = 1300;
			hotel = 1500;
		}
		if (name == "Boardwalk"){
			 startPrice = 400;
			initRent = 50;
			currentRent = initRent;
			colour = "Blue";
			housePrice = 200;
			mortgagePrice = startPrice/2;
			house1 = 200;
			house2 = 600;
			house3 = 1400;
			house4 = 1700;
			hotel = 2000;
		}
		if (name == "Electric"){
			startPrice = 150;
			colour = "Utilities";
			currentRent = 0;
			/* rent is 0 now, but there should be a var for roll 
			so that it can utilize the rent value */
		}
		if (name == "Water"){
			startPrice = 150;
			colour = "Utilities";
			currentRent = 0;
			
		}
		if (name == "Reading"){
			startPrice = 200;
			colour = "Railroad";
			currentRent = 0;
			
		}
		if (name == "Pennsylvania RR"){
			startPrice = 200;
			colour = "Railroad";
			currentRent = 0;
		}
		if (name == "B&O"){
			startPrice = 200;
			colour = "Railroad";
			currentRent = 0;
		}
		if (name == "Short Line"){
			startPrice = 200;
			colour = "Railroad";
			currentRent = 0;
		}
			/* rent is 0 now, but there should be a var for roll 
		so that it can utilize the rent value */
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public int getRent(){
		return this.currentRent;
	}
	
	public void addHouse(){
		numHouses ++;
		if (numHouses == 1)
			currentRent = house1;
		else if (numHouses == 2)
			currentRent = house2;
		else if (numHouses == 3)
			currentRent = house3;
		else if (numHouses == 4)
			currentRent = house4;
		else if (numHouses == 5)
			currentRent = hotel;
	}
	
	public int mortgage(){//also used to unmortgage
		this.mortgaged = !(this.mortgaged);
		return this.mortgagePrice;
	}
	
	public Object getType(){
		return getClass().getEnclosingClass();
	}
	
	public String getEvent(){
		if (mortgaged == true)
			return "Mortgaged :)";
		if (owned == false)
			return "Buy?";
		if (owned == true)
			return "Rent!";
	}
	
    public Player getOwner(){
	return owner;
    }
	
}
