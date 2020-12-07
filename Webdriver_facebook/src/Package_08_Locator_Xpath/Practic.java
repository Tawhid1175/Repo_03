package Package_08_Locator_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practic {

	public static void main(String[] args) {
		
		
		
		//tagname[@attribute='value']
		//tagname[contains(@attribute,'value')]
		//tagname[Text()=visiable test]
		
		//tagname[strat-with(@attribute,'value')]
		
		//tagname[@attribute='value' and @attribute='value']
		
		 //tagname[@attribute='value']
		//tagname[contains(@attribute,'value')]
		 
		//tagname[Text()='visible']
		//(tagname[start-with(@attribute,'value')])[]


		
		// Types of xpath
		// a: absolute xpath
		// b : Relational xpath
		
		// 1:  absulat xpatha == (/html/body/div/div/div)[1]
		
	    // b: Relational xpath
		
		// 1: basic Syntax = //tagname[@attribute='value']
          
		// 2: contains method = //tagname[contains(@attribute,'value')]
		
		// 3: Text method ==//tagname[Text()='visibleText']
		
		// 4: starts-with =//tagname[starts-with(@attribute,'value')]
		
		// 5: Index == (//tagname[Text()='visibleText'])[]
		
		// 6: multifall value == //tagname[@attribute='value' and @attribute='value']
	}

}
