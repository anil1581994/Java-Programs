package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class StringPermutation {
 Utility utility=new Utility();
 

 String str =utility.getString();
 int n = str.length();
 /*Permutation permutation = new Permutation();
 permutation.permute(str, 0, n-1);*/
 utility.permute(str,0,n-1);
 
 
	
}
