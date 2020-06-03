package com.codecool.tinkertailor;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	    TinkerTailor tinkerTailor = new TinkerTailor(5, 3);
		tinkerTailor.execute();
	    List outcome = tinkerTailor.execute();
	    System.out.println("The outcome of the game is: " + outcome);
    }
}
