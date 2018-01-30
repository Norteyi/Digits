import java.util.ArrayList;

public class Digits {
		private ArrayList<Integer> digitList = new ArrayList<Integer>();
		private int num;
		private int digit;
		
		public Digits (int nums) {
			num = nums;
			for(num = 12531643; num != 0;num= num/10) {
				digit = num % 10; 
				digitList.add(0, digit);
				
			}

		}
		public void print() {
			for(int x =  0; x<digitList.size(); x++) {
				System.out.print(digitList.get(x)+" ");
			}
			System.out.println();
			
		}
}
