package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;


public class main_misc {
    //private static HashMap<String,String> cache = new HashMap<>();
	public static void main(String[] args) {
	   
		System.out.println(is_unique("abcdefgijklmnopta"));
		System.out.println(is_unique("abcdefgijklmnoptz"));
	}
	
	private static int b_search(ArrayList<Integer> l,int x,int not) {
		
		int low = 0;
		int high = l.size() -1;
		
		
		while(low <= high) {
			int middle = (high+low)/2;
			int middle_num = l.get(middle);
			
			if(x == middle_num) {
				if(middle != not) {
					return middle;
				}
				low++;
			}
			if(x < middle_num){
				high = middle -1;
			}
			if(x > middle_num) {
				low = middle +1;
			}		
		}
		return -1;
		
	}
	
	private static int is_unique(String s) {
		//O(nlog(n) + n + n + nlog(n)) --> O(nlog(n))
		
		
		char [] c = s.toCharArray();//O(n)
		ArrayList<Integer> l = new ArrayList<>();
		
		for(int i = 0;i < c.length;i++) {//O(n)
			int x = c[i];
			l.add(x);//O(1)
		}
		
		l.sort(Comparator.naturalOrder());//O(nlog(n))
		
		System.out.println(l);
		
		for(int i = 0;i < l.size();i++) {//O(nlog(n))
			if(b_search(l,l.get(i),i) != -1) {
				//I found a value that is equal to another one in the array
				return 0;
			}
		}
		
		return 1;
	}
	
	}
	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

