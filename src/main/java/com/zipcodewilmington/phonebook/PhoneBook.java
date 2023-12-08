package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */


public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook =map;
    }

    public PhoneBook() {
        this(new LinkedHashMap<String, List<String>>());
    }

    public void add(String name, String phoneNumber) {
        ArrayList<String> str = new ArrayList<>();
        str.add(phoneNumber);
        phonebook.put(name,str);

    }

    public void addAll(String name, String... phoneNumbers) {
        ArrayList<String> str = new ArrayList<>();
        for(int i=0; i< phoneNumbers.length; i++){
            str.add(phoneNumbers[i]);
            phonebook.put(name,str);
        }

    }


    public void remove(String name) {
        phonebook.remove(name);

    }

    public Boolean hasEntry(String name) {

        return phonebook.containsKey(name);
    }

    public Boolean hasEntry(String name, String phoneNumber) {

       return  phonebook.get(name).contains(phoneNumber);
    }

    public List<String> lookup(String name) { // Looking for the value
        return phonebook.get(name);

    }


    public String reverseLookup(String phoneNumber) { // looking the key
        for(String name : phonebook.keySet()){ // It Loops through each name in the phonebook using for each Loop
            /// it checks if the phoneNumber associated with the current name in the phonebook contains the given phoneNumber
            if(phonebook.get(name).contains(phoneNumber)){
            // if there is a match return the key
                return name;
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        ArrayList<String>rn = new ArrayList<>();
        for(String name : phonebook.keySet()){
            rn.add(name);
        }
        return rn;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }




}
