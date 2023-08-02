package org.example;

public class Program {
    public static void main(String[] args){
        HashMap<String, String> hashMap = new HashMap<>(4);


        String prevValue = hashMap.put("+456321788", "Andry");
        prevValue = hashMap.put("+456321789", "Andry");
        prevValue = hashMap.put("+456321789", "Serge");


        String searchValue = hashMap.get("+456321789");

        prevValue = hashMap.remove("+456321789");
        prevValue = hashMap.remove("+456321789");

        searchValue = hashMap.get("+456321789");


    }


}
