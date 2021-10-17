package com.pebbles;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BlackBag extends Bag{

    public BlackBag(String id, String filename, int num_player) throws InsufficientPebblesExcpetion, BagFileFormatExcpetion, FileException {
        super(id, filename, num_player);
    }

    public void fillBag(){
        ArrayList<AtomicInteger> pebs = LinkedId.getPebbles();
        pebbles = pebs;
        LinkedId.setPebbles(null);
    }

    public AtomicInteger drawBag() throws BagEmptyException {
        AtomicInteger m;
        if (pebbles.size() > 0){

            //get a random item from list/array
            Random rand = new Random();
            // Obtain a number between [0 - length of list].
            int n = rand.nextInt(pebbles.size()-1);
            m = pebbles.get(n);
            pebbles.remove(n);


        }else{
            this.fillBag();
            throw new BagEmptyException("This Bag is empty! Look for the next one!");
        }
        return m;

    }


}
