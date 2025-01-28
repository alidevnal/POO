package ejercicio4;

import java.util.Vector;
import java.util.Scanner;

public class Team {
    private String name;
    private static double totalTime;
    private String country;
    private final Vector<Cyclist> cyclistsList;

    public Team(String name, String country) {
        this.name = name;
        this.country = country;
        totalTime = 0;
        cyclistsList = new Vector<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getCountry() {
        return country;
    }

    private void setCountry(String country) {
        this.country = country;
    }

    void addCyclist(Cyclist cyclist) {
        cyclistsList.add(cyclist);
    }

    void listTeam() {
        for (Cyclist c : cyclistsList) {
            System.out.println(c.getName());
        }
    }

    void searchCyclist() {
        Scanner sc = new Scanner(System.in);
        String cyclistName = sc.next();
        for (Cyclist c : cyclistsList) {
            if (c.getName().equals(cyclistName)) {
                System.out.println(c.getName());
            }
        }
    }

    void calculateTotalTime() {
        for (Cyclist c : cyclistsList) {
            totalTime += c.getAccumulatedTime();
        }
    }

    void print() {
        System.out.println("Team name = " + name);
        System.out.println("Country = " + country);
        System.out.println("Total team time = " + totalTime);
    }
}
