import java.util.*;

import java.io.*;

public class iterateHash{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Ant");// list.add ----array r belai
        set.add("Bee");
        set.add("Dog");
        set.add("Hati");
        System.out.println("Size of the Set : " + set.size()); // Size of the Set: 3
        System.out.println(set);
        if(set.contains("Hati")){
            System.out.println("set contains 1");
        }
        if(!set.contains("Mango")){
            System.out.println("doesnot contain");
        }
    set.remove("Hati");
    if(!set.contains("Hati")){
        System.out.println("does not contain 1");
    }
    System.out.println(set);
   
   //iterator
   /* Iterator it = set.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }*/
    Iterator i = set.iterator();
    while(i.hasNext()){
        System.out.println(i.next());
    }
    }
}