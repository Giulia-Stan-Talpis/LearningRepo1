package org.example;

import java.util.*;

public class App {
    public static void main( String[] args){
        List<String> names = new ArrayList<>();
        names.add("Jerry");
        names.add("Elaine");
        names.add("Kramer");
        names.add("George");
        names.add(1,"Giulia");
        names.add("Giulia");
        System.out.println(names);
        System.out.println(names.get(3));
        names.set(5, "Newman");
        names.remove("Giulia");
        System.out.println(names);
        System.out.println(names.isEmpty());
        Collections.sort(names);
        System.out.println(names);
        Collections.reverse(names);
        System.out.println(names);
        String[] namesArray = names.toArray(new String[0]);
        System.out.println(namesArray);
        names.clear();

        Set<String> newNames = new HashSet<>();
        newNames.add("Jerry");
        newNames.add("George");
        newNames.add("Elaine");
        newNames.add("Kramer");
        System.out.println(newNames);
        newNames.remove("Kramer");
        System.out.println(newNames);


    }
}
