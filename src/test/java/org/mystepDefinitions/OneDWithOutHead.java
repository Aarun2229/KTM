package org.mystepDefinitions;

import java.util.ArrayList;
import java.util.List;

public class OneDWithOutHead 
{
	public static void main(String[]args)
	{
		List<String> oneDH = new ArrayList<String>();
		oneDH.add("Arun");
        oneDH.add("arunuvan@gmail.com");
        oneDH.add("JAVA");
        oneDH.add("MADRAS");
        
       String s= oneDH.get(3);
       System.out.println(s);
	}

}
