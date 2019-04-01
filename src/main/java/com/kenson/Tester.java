package com.kenson;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Tester {
    public static void main(String[] args) {
//        ArrayList<Integer>list=new ArrayList<>();
//        list.add(55);
//        list.add(90);
//        list.add(85);
//        list.add(60);
//        Collections.sort(list);
//        System.out.println(list);

        ArrayList<String>list=  new ArrayList<>();
        String str="2337,台積電,5483,中美晶,3026,禾伸堂,2327,國巨";
        HashMap<String,String> stocks=new HashMap();
        String[] spl=str.split(",");
        int a=0,b=1;
            for(int i=a;i<b;i++){
                //System.out.println("a:"+i+","+"b:"+(i+1));
               stocks.put(spl[i],spl[i+1]);
                b++;
                if(b==4){break;}

            }


//            stocks.put(spl[0],spl[1]);
//            stocks.put(spl[2],spl[3]);
       System.out.println(spl[3]);


//        String res="";


//        System.out.println(list);

    }
}
