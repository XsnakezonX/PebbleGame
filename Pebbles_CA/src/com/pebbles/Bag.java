package com.pebbles;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Bag {

    public String id;
    public ArrayList<AtomicInteger> pebbles;
    public Bag LinkedId;

    public Bag(String id, String filename, int num_player) throws InsufficientPebblesExcpetion, BagFileFormatExcpetion, FileException {

        ArrayList<AtomicInteger> pebs = initialiseBag(filename, num_player);

        this.id = id;
        this.pebbles = pebs;
    }

    public String getId() {
        return id;
    }

    public ArrayList<AtomicInteger> getPebbles() {
        return pebbles;
    }

    public Bag getLinkedId() {
        return LinkedId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPebbles(ArrayList<AtomicInteger> pebbles) {
        this.pebbles = pebbles;
    }

    public void setLinkedId(Bag linkedId) {
        LinkedId = linkedId;
    }

    public ArrayList<AtomicInteger> initialiseBag(String filename, int num_player) throws InsufficientPebblesExcpetion, BagFileFormatExcpetion, FileException {

        ArrayList<String> pebs = readBagFile(filename);
        ArrayList<AtomicInteger> pebbles = new ArrayList<AtomicInteger>();


        if (pebs.size() >= num_player*11){
            for (int i = 0; i < pebs.size()-1; i++ ){
                try{
                    AtomicInteger temp = new AtomicInteger(Integer.valueOf(i));
                    pebbles.add(temp);
                }catch (Exception e){
                    throw new BagFileFormatExcpetion("Format of Bag file not compatible with program");
                }
            }
        }else{
            throw new InsufficientPebblesExcpetion("The amount of elements in the file does not match or exceed 11*player_count");
        }
        return pebbles;
    }

    public ArrayList<String> readBagFile(String filename) throws FileException {

        String line = "";
        String splitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null){
                ArrayList<String> temp = new ArrayList<String>(List.of(line.split(splitBy)));
                return temp;
            }
        } catch (IOException e) {
            throw new FileException("File name or Location invalid, file not accessible");
        }
        return null;
    }


}
