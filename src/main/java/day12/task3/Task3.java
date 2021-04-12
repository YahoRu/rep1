package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(new MusicBand("ARIA", 1985));
        musicBandList.add(new MusicBand("CAPRICE",1998));
        musicBandList.add(new MusicBand("PPK",1999));
        musicBandList.add(new MusicBand("PROPAGANDA",2001));
        musicBandList.add(new MusicBand("Serebro", 2006));
        musicBandList.add(new MusicBand("BI 2", 1988));
        musicBandList.add(new MusicBand("Vintaj",2006));
        musicBandList.add(new MusicBand("Gradusi",2008));
        musicBandList.add(new MusicBand("Korni", 2002));
        musicBandList.add(new MusicBand("Tatu",2011));

        System.out.println(musicBandList);
        Collections.shuffle(musicBandList);
        System.out.println(musicBandList);
        groupsAfter2000( musicBandList);
        System.out.println(groupsAfter2000(musicBandList));
        System.out.println(musicBandList);


    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBandList){
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for(int i = 0; i < musicBandList.size(); i++){
            if(musicBandList.get(i).getYear() > 2000){
                groupsAfter2000.add(musicBandList.get(i));
            }
        }
        return groupsAfter2000;
    }

}
