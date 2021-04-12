package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> group1 = new ArrayList<>();

        group1.add(new MusicArtist("Jhon", 30));
        group1.add(new MusicArtist("Dimon", 61));
        group1.add(new MusicArtist("Andrey", 19));
        group1.add(new MusicArtist("Bob", 44));
        group1.add(new MusicArtist("Karl", 48));

        List<MusicArtist> group2 = new ArrayList<>();

        group2.add(new MusicArtist("Vova", 18));
        group2.add(new MusicArtist("Evgeny", 29));
        group2.add(new MusicArtist("Vlad", 22));
        group2.add(new MusicArtist("Seva", 41));
        group2.add(new MusicArtist("Nikolay", 33));
        group2.add(new MusicArtist("Bill", 56));
        group2.add(new MusicArtist("Djoe", 22));

        MusicBand band1 = new MusicBand("BAND 1", 2020, group1);
        MusicBand band2 = new MusicBand("BAND 1", 2020, group2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
        band1.getMembers();
        band2.getMembers();


    }
}
