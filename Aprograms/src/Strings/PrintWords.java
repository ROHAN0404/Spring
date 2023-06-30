package Strings;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PrintWords {

	public static int countVowel(String s1)
	{
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
				count++;
		}
		return count;
	}
	public static int countWord(String s1)
	{
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ' || s1.charAt(i)=='.')
				count++;
		}
		return count;
	}
	public void frequency(String s1)
	{
		TreeMap <Character,Integer> map=new TreeMap<>();
		for(int i=0;i<s1.length();i++)
		{
			Integer c=map.get(s1.charAt(i));
			if(map.get(s1.charAt(i))==null) {
				map.put(s1.charAt(i), 1);
			}
			else {
				map.put(s1.charAt(i), ++c);
			}
		}
		for(Map.Entry entry : map.entrySet()) {
		System.out.println("Character= "+entry.getKey()+" frequency= "+entry.getValue());

		}
	}
	public static void main(String[] args) {
		String s1="Learn with Rohan Bhaiyaee.";
		System.out.println("Words :" +countWord(s1));
		System.out.println("Vowels :" +countVowel(s1));
		PrintWords p=new PrintWords();
		
		p.frequency(s1);
	}
	

}
