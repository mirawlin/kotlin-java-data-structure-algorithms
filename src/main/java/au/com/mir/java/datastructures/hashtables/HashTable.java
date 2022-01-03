package au.com.mir.java.datastructures.hashtables;

import java.util.ArrayList;
import java.util.Arrays;

public class HashTable {
    ArrayList<KeyValue>[] data;
    Integer currentSize;

    public HashTable(Integer size) {
        data = new ArrayList[size];
        currentSize = 0;
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.codePointAt(i) * i) % data.length;
        }
        return hash;
    }

    //O(1)
    public void set(String key, Integer value) {
        Integer address = hash(key);
        if( data[address] == null) {
            ArrayList<KeyValue> arrayAtAddress = new ArrayList<>();
             data[address] = arrayAtAddress;
        }
        KeyValue pair = new KeyValue(key, value);
        data[address].add(pair);
        currentSize++;
    }

    //O(1)
    public Integer get(String key) {
        var address = hash(key);
        var currentBucket = data[address];

        if(currentBucket != null) {
            for(int i = 0; i < currentBucket.size(); i++) {
                if(currentBucket.get(i).getKey().equals(key))
                    return currentBucket.get(i).getValue();
            }
        }
        return null;
    }

    public String[] keys() {
        var keysArray = new String[currentSize];
        var arraySize = 0;

        for(int i = 0; i < data.length; i++) {
            if(data[i] != null) {
                keysArray[arraySize] = data[i].get(0).getKey();
                arraySize++;
            }
        }
        return keysArray;
    }


    public static void main(String[] args) {
        HashTable hashTable = new HashTable(50);
        hashTable.set("grapes", 1200);
        hashTable.set("apples", 1200);
        hashTable.set("oranges", 5000);
        System.out.println("value for key grapes: " + hashTable.get("grapes"));
        System.out.println("value for key apples: " + hashTable.get("apples"));
        System.out.println("list of keys: " + Arrays.toString(hashTable.keys()));
    }
}
