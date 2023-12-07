package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */


public class PhoneBook {

    public static void main(String[] args) {
        Map<String,Integer> map  = new HashMap<>();

        map.put("Christ", 610-222-4569);
        map.put("Joe", 610-544-9087);
        map.put("Sam", 610-674-7865);
        map.put("Dean", 610-777-4567);
    }



    private final Map<String, List<String>> phonebook;

    public Map<String, List<String>> getPhonebook() {
        return phonebook;
    }



    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = null;
    }

    public PhoneBook() {
        this(null);
    }

    public void add(String name, String phoneNumber) {
    }

    public void addAll(String name, String... phoneNumbers) {
    }

    public void remove(String name) {
    }

    public Boolean hasEntry(String name) {
        return null;
    }

    public List<String> lookup(String name) {
        return null;
    }

    public String reverseLookup(String phoneNumber) {
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return null;
    }

}
