import java.util.*;
import java.io.*;

public class Cards extends EventTile{
    Random r = new Random ();
    public String makecommunitydeck (int a) {
	if (a == 0){
		return "Advance to Go- Collect $200";
	    }
	if (a == 1){
		return "Bank error in your favor – Collect $75 ";
	    }
	if (a == 2){
		return "Doctor's fees – Pay $50";
	    }
	if (a == 3){
		return "Get out of jail free – This card may be kept until needed, or sold ";
	    }
	if (a == 4){
		return "Go to jail – go directly to jail – Do not pass Go, do not collect $200";
	    }
	if (a == 5){
		return "It is your birthday- Collect $10 from each player";
	    }
	if (a == 6){
		return "Grand Opera Night – Collect $50 from every player";
	    }
	if (a == 7){
		return "Income Tax refund – Receive $20 ";
	    }
	if (a == 8){
		return "Pay Hospital Fees- Pay $100";
	    }
	if (a == 9){
		return "Pay School Fees- Pay $50";
	    }
	if (a == 10){
		return "Receive Consultancy Fee- Receive $25";
	    }

	if (a == 11){
		return "You are assessed for street repairs – Pay $40 per house, $115 per hotel ";
	    }
	if (a == 12){
		return "You have won second prize in a beauty contest– Collect $10 ";
	    }
	if (a == 13){
		return "You inherit money - Receive $100";
	    }
	if (a == 14){
		return "Sold Stocks- Collect $50 ";
	    }
	if (a == 15){
		return "Holiday Fund matures - Collect $100 )";
	    }
	}

    public String makechancedeck (int a) {
	if (a == 0){
		return "Advance to Go- Collect $200";
	    }
	if (a == 1){
		return "Advance to Illinois Ave ";
	    }
	if (a == 2){
		return "Advance token to nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times the amount thrown. ";
	    }
	if (a == 3){
		return "Advance token to the nearest Railroad and pay owner twice the rental to which he/she is otherwise entitled. If Railroad is unowned, you may buy it from the Bank.";
	    }
	if (a ==4) {
		return "You have won a crossword competition- Collect $150";
	    }
	if (a == 5){
		return "Advance to St. Charles Place – If you pass Go, collect $200 ";
	    }
	if (a == 6){
		return "Bank pays you dividend of $50- Collect $50";
	    }
	if (a == 7){
		return "Get out of Jail free – this card may be kept until needed, or traded/sold";
	    }
	if (a == 8){
		return "Go back 3 spaces ";
	    }
	if (a == 9){
		return "Go directly to Jail – do not pass Go, do not collect $200 ";
	    }
	if (a == 10){
		return "Make general repairs on all your property – for each house pay $25 – for each hotel $100 ";
	    }

	if (a == 11){
		return "Pay poor tax- Pay $15";
	    }
	if (a == 12){
		return "Take a trip to Reading Railroad – if you pass Go collect $200";
	    }
	if (a == 13){
		return "Take a walk on the Boardwalk – advance to Boardwalk ";
	    }
	if (a == 14){
		return "You have been elected chairman of the board – Pay each player $50 ";
	    }
	if (a == 15){
		return "Your building loan matures – Collect $150";
	    }
	}
    }
}

        
