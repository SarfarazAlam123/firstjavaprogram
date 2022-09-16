package com.company;
import java.util.*;


public class Mapping {
    public static void main(String[] args) {
        String x="spiderweb";
       char []y =x.toCharArray();
        int size = y.length;
        Map<Character, Integer> map=new LinkedHashMap<>();
        int i=0;
        while(i!=size)
        {
            if (map.containsKey(y[i])==false)
            {
                map.put(y[i],1);
            }
            else
            {
                int oldval=map.get(y[i]);
                int newval=oldval+1;
                map.put(y[i],newval);
            }
            i++;
        }
        System.out.println(map);

        Set<Map.Entry<Character,Integer>> lmap=map.entrySet();
        //for accessing data from map

        for(Map.Entry<Character,Integer> data: lmap)
        {
            System.out.print(data.getKey());
            System.out.println(data.getValue());

        }

        //for first non repeating char
        for(Map.Entry<Character,Integer> data: lmap)
        {
            if (data.getValue() > 1)
            {
                System.out.print(data.getKey());
                System.out.println(data.getValue());

            }
        }
        // for removing dublicate char
        String c="";
        for(Map.Entry<Character,Integer> data: lmap)
        {
           c=c+data.getKey();

        }
        System.out.println(c);

    }
}
