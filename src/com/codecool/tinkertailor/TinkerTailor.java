package com.codecool.tinkertailor;

import java.util.ArrayList;
import java.util.List;

class TinkerTailor {

    int n, k;
    // Array List that holds the kids for each game
    private List<Integer> kidsArray=new ArrayList<Integer>();


    public TinkerTailor(int n, int k) {
        this.n=n;
        this.k=k;
    }

    // Method that adds kids to the kidsArray
    private void addKids(int n) {
        for (int i=1; i <= n; i++) {
            kidsArray.add(i);
        }
    }

    public List execute() {

        addKids(n);

        List<Integer> outcome=new ArrayList<>();


        // starting counter for each round
        int currentCounter=0;

        // the eliminated kid after each round
        int numKidToAdd=0;

        // the current round
        int numRounds=0;

        while (kidsArray.size() > 0) {

            // increase the round number
            numRounds+=1;

            // setting the starting counter index for this round
            currentCounter=numKidToAdd;

            // if there is only one kid in the kidsArray we add him to the outcome Array
            if (kidsArray.size() == 1) {
                outcome.add(kidsArray.get(0));
                kidsArray.remove(0);
                break;
            }

            // determine the index of the kid to be removed
            numKidToAdd=kidsArray.size() - k * numRounds > 0 ? k - 1 : (currentCounter + k - 1) % kidsArray.size();

            // adding the eliminated kid to the outcome ArrayList
            outcome.add(kidsArray.get(numKidToAdd));
            // removing the eliminated kid from the kidsArray
            kidsArray.remove(numKidToAdd);
        }

        return outcome;
    }
}