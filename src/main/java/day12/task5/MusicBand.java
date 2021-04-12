package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> fio;

    public MusicBand(String name, int year, List<MusicArtist> fio) {
        this.name = name;
        this.year = year;
        this.fio = fio;
    }

    public List<MusicArtist> getFio() {
        return fio;
    }

    public void setFio(List<MusicArtist> fio) {
        this.fio = fio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", fio=" + fio +
                '}';
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        for (MusicArtist artist : musicBand1.getFio())
            musicBand2.getFio().add(artist);

        musicBand1.getFio().clear();
    }

    public void printMembers() {
        System.out.println(this.fio);
    }

    public List<MusicArtist> getMembers() {
        return getFio();
    }
}
