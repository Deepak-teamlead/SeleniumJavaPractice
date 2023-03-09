package java_practice_1;
public class Arrays_Typesofarrays {
//Arrays, Types of Arrays
//1.Single Dimensional Arrays
public static void main(String[] args) {
	int[] oned= {1,2,3,4,6};
	System.out.println(oned[4]);
	oned[4]=5;
	for(int i=0;i<oned.length;i++) {
		System.out.println("Elements in integer Array are : "+oned[i]);
		}

//2.Two Dimensional Array
   int[][] twod= { {1,2,3}, {4,5,6}, {7,8,9}};
   System.out.println("Output sould be 6 : "+ twod[1][2]);
   for(int k=0;k<twod.length;k++) {
	   for(int l=0;l<twod.length; l++) {
	   System.out.println("Elements in Two Dimensional Array are : "+ twod[k][l]);
   }
   }
   }
}
