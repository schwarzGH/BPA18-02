package first_package;

import java.io.*;
import java.util.*;
import java.util.Arrays;

public class MainClass {
	/*
	    * ���������� ������������ �������� ������������ ��������� ��������� �������. �������� ���������� � ������������, ����
		* �������� ����� ������ ���������� ������������ ������ ���� ����� 1.	
		* ����: n - ���������� ����� � �������
		*		a - ������ �����
		* 		2 <= n <= 100
		*		0 < a[i] < 100
		*		����� ������ ���� >=2, �������� ����� ������
		* ������:
		*  9
		*  1 1 2 2 4 4 5 5 5
		* �����:
		* 5
		*
		* 6
		* 4 6 5 3 3 1
		* �����:
		* 3
		*/
			   
	   
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {

	    	
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        
	        int[] a = new int[n];
	        String[] aItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int aItem = Integer.parseInt(aItems[i]);
	            a[i] = aItem;
	        }
	        
	        scanner.close();	        	        	        	        
	        
	        new Thread(() -> {
	        	Solver solver = new Solver();
		        solver.setArray(a);
	        	System.out.print(solver.FirstTaskSolution(solver));
	        }).start();
	        	        
	        
	    }
}
