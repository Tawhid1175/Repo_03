package Package_03_Switch_Case;

public class Program_01_first {

	public static void main(String[] args) {
		
		// ekhne onk ghule condition thakbe r , condition meye break korbe
		// ekhne ami jodi x er value 1 di tahole se sob print korbe
		// Bangladesh, USA< out of erath
		// Switch case aita holo subida , prothm condition true hole sob ghuli print korbe
		
		// note 1: switch case float kaj kore na, 1.24
		// note : 2 ekhne ami jodi prothi condition e breack di , tahole amr condition true hole loof vegge lage
		
		int x = 3;
		
		switch (x) {
		
		case 1:
			System.out.println(" Bangladesh");
			
		case 2:
			System.out.println(" USA");
			
			default:
				
				System.out.println(" Out of earth");
		}
		

		
		
	}

}
