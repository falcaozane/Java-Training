package test;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj[][] = new Object[3][2];
		
		obj[0][0] = "B";
		obj[0][1] = 56001;
		
		obj[1][0] = "C";
		obj[1][1] = 58001;
		
		obj[2][0] = "D";
		obj[2][1] = 57001;
		
//		obj[3][0] = "B";
//		obj[3][1] = 59001;
		
		System.out.println("Row count "+obj.length);
		System.out.println("Column size "+obj[0].length);
		
		for(int i=0;i<obj.length;i++) {
			for(int j=0;j<obj[0].length;j++) {
				System.out.println(obj[i][j]);
			}
		}
		
		System.out.println("\n===============\n");
		
		for(Object[] row:obj) {
			for(Object element: row) {
				System.out.println(element);
			}
			System.out.println();
		}
	}

}
