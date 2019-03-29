package dkc_0329;

import java.io.*;
import java.util.*;

public class PrintWordCount {
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        String[] str = s.split(" ");
        for(String i : str) {
        	list.add(i);
        }
        for(int i = 0;i<list.size();i++) {
        	if(list.get(i).contains(",")) {
        		String[] mmp = list.get(i).split(",");
        		list.set(i, mmp[0]);
        		for(int j = 1;j<mmp.length;j++) {
        			list.add(mmp[j]);
        		}
        	}
        	if(list.get(i).endsWith(".")) {
        		String tmp = list.get(i).substring(0, list.get(i).length()-1);
        		list.set(i, tmp);
        	}
        }
        Map<String,Integer> mp = new TreeMap<String,Integer>();
        for(int i = 0;i<list.size();i++){
            if(!mp.containsKey(list.get(i))){
                int count = 0;
                mp.put(list.get(i),++count);
                for(int j = i+1;j<list.size();j++){
                    if(list.get(i).equals(list.get(j))){
                        mp.put(list.get(j),++count);
                    }
                }
            }
        }
        while(mp.size()>0) {
        	int max = 0;
        	String sign = null;
        	for(Map.Entry<String,Integer> e : mp.entrySet()){
        		if(max < e.getValue()) {
        			max = e.getValue();
        			sign = e.getKey();
        		}
        	}
        	System.out.println(sign+":"+max);
        	mp.remove(sign);
        	
        }
    }
	
}
