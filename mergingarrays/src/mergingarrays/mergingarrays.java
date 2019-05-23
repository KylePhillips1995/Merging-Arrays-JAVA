package mergingarrays;

public class mergingarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = {20, 30, 40, 50};
		int[] b = {25, 30, 45, 65, 70, 90};
		
		int[] c = new int[10];
		
		int k = 0;
		
	
		
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				
			
			if(a[i] == a.length) {
					
					c[k] = b[j];	
			}
			
			else if(b[j] == b.length) {
				
				c[k] = a[i];
			}
			
			else if(a[i] < b[j]) {
				
				c[k] = a[i];
				
			}
			
			else {
				c[k] = b[j];
			}
			
			
			
			}
		
			
				
				
		}
		
		System.out.println(c);
		
		}
	}


