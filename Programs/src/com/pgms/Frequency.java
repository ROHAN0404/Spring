package com.pgms;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

	public static void main(String[] args) {
		int a[]=new int[]{1,2,3,5,5,6,7,1,1};
		HashMap<Integer, Integer> hc=new HashMap<>();
		
		System.out.println(hc.get(a[1]));
		for(int i=0;i<a.length;i++)
		{
			if(hc.containsKey(a[i])) {
				hc.put(a[i],hc.get(a[i])+1);
			}
			else {
				hc.put(a[i],1);
			}
				
		}
		for(Map.Entry<Integer,Integer> entry : hc.entrySet()) {
			System.out.println("Element= "+entry.getKey()+" frequency= "+entry.getValue());

			}
	
	}
}
