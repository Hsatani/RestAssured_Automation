package org.Testing.TestTrigger;

import java.io.IOException;
import org.Testing.TestCases.TC1;
import org.Testing.TestCases.TC2;
import org.Testing.TestCases.TC3;

public class Trigger {
	
	
	public static void main(String[] args) throws IOException{
		
		TC1 TC1obj = new TC1();
		TC1obj.testcase1();
		
		
		TC2 TC2obj = new TC2();
		TC2obj.testcase2();
		
		
		
		TC3 TC3obj = new TC3();
		TC3obj.testcase3();
		
		
		
	}
	
	


}
