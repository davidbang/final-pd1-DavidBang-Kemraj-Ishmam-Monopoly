import java.util.*;
import java.io.*;

public class Cards{
    Random r = new Random ();
    public String makecommunitydeck (int a) {
	if (a == 0){
	    return "Advance to Go Collect 200";
	}
	if (a == 1){
	    return "Bank error in your favor  Collect 75";
	}
	if (a == 2){
	    return "Doctor's fees Pay 50";
	}
	if (a == 3){
	    return "Bank Tax Pay 50";
	}
	if (a == 4){
	    return "Tax Refunds Collect 50";
	}
	if (a == 5){
	    return "It is your birthday Collect 40";
	}
	if (a == 6){
	    return "Grand Opera Night Collect 150";
	}
	if (a == 7){
	    return "Income Tax refund  Receive 20 ";
	}
	if (a == 8){
	    return "Pay Hospital Fees Pay 100";
	}
	if (a == 9){
	    return "Pay School Fees Pay 50";
	}
	if (a == 10){
	    return "Receive Consultancy Fee Receive 25";
	}
	
	if (a == 11){
	    return "You are assessed for street repairs Pay 200";
	}
	if (a == 12){
	    return "You have won second prize in a beauty contest Collect 10 ";
	}
	if (a == 13){
	    return "You inherit money Receive 100";
	}
	if (a == 14){
	    return "Sold Stocks Collect 50 ";
	}
	if (a == 15){
	    return "Holiday Fund matures  Collect 100 ";
	}
	return "";
    }
    
    public String makechancedeck (int a) {
	if (a == 0){
	    return "Advance to Go Collect 200";
	}
	if (a == 1){
	    return "Advance to Illinois Ave ";
	}
	if (a == 2){
	    return "Advance token to Utility. If unowned, you may buy it from the Bank ";
	}
	if (a == 3){
	    return "Advance token to the Railroad ";
	}
	if (a ==4) {
	    return "You have won a crossword competition Collect 150";
	}
	if (a == 5){
	    return "Money on the floor Collect 100 ";
	}
	if (a == 6){
	    return "Bank pays you dividend Collect $50";
	}
	if (a == 7){
	    return "Lost Wallet Collect 50";
	}
	if (a == 8){
	    return "Found a ring Collect 50 ";
	}
	if (a == 9){
	    return "Bank debt Pay 200 ";
	}
	if (a == 10){
	    return "Make general repairs on all your property Pay 100";
	}
	
	if (a == 11){
	    return "Pay poor tax Pay 15";
	}
	if (a == 12){
	    return "Take a trip to Reading Railroad if you pass Go collect 200";
	}
	if (a == 13){
	    return "Lost Dog Found Collect 50";
	}
	if (a == 14){
	    return "You have been elected chairman of the board Pay 50 ";
	}
	if (a == 15){
	    return "Your building loan matures Collect 150";

	}
	return "";
    }
}
