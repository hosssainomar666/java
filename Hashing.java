import java.util.*;

import java.io.*;

public class Hashing {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);// list.add ----array r belai
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println("Size of the Set : " + set.size()); // Size of the Set: 3
        System.out.println(set);
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("doesnot contain");
        }
    set.remove(1);
    if(!set.contains(1)){
        System.out.println("does not contain 1");
    }
    System.out.println(set);
   
   //iterator
    Iterator it = set.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    } 
    }
}