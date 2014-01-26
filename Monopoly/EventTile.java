import java.io.*;
import java.util.*;

public class EventTile extends Tiles{
    String eventName;
    public EventTile(String name){
	eventName = name;
    }
    public Object getType(){
	return getClass().getEnclosingClass();
    }
    public String getEvent(){
	if (eventName == "Go")
	    return "Pass Go";
	if (eventName == "C.C.")
	    return "Community Chess";
	if (eventName == "Income Tax")
	    return "Income Tax";
	if (eventName == "Chance")
	    return "Chance";
	if (eventName == "Free Parking")
	    return "Free Parking";
	if (eventName == "Go To Jail")
	    return "Send Jail";
	if (eventName == "Luxury Tax")
	    return "Luxury Tax";
	if (eventName == "Jail")
	    return "Jail";
	return "";
    }
}