package lesson42mySql;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(new Computer("MacBook Pro", 512));
        computers.add(new Computer("Dell XPS", 256));
        computers.add(new Computer("HP Spectre", 512));

        Collections.sort(computers, new Comparator<Computer>() {

            public int compare(Computer c1, Computer c2) {
                return c1.getStorage().compareTo(c2.getStorage());
            }
        });
    }
}
