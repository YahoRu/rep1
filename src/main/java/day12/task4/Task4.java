package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> acters1 = new ArrayList<String>();
        acters1.add("Jhon Lenon");
        acters1.add("Andrw Block");
        List<String> acters2 = new ArrayList<String>();
        acters2.add("Anna Ego");
        acters2.add("Jil Gerr");
        MusicBand band1 = new MusicBand("BAND 1", 2020,acters1);
        MusicBand band2 = new MusicBand("BAND 2", 1990,acters2);
        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1,band2);

        band1.printMembers();
        band2.printMembers();
        band1.getMembers();
        band2.getMembers();

    }
}
