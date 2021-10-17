package com.pebbles;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WhiteBag extends Bag{

    public WhiteBag(String id, String filename, int num_player) throws InsufficientPebblesExcpetion, BagFileFormatExcpetion, FileException {
        super(id, filename, num_player);
    }

    public void addBag(AtomicInteger temp){
        pebbles.add(temp);
    }

}
