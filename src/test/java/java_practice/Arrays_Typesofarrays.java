package java_practice;
public class Arrays_Typesofarrays {
//Arrays, Types of Arrays
/* Declaring array
 *add values into array
 * find size of array
 * read single values from array
 * read multiple values from an array
 */
//1.Single Dimensional Arrays
public static void main(String[] args) {
	int[] oned= {1,2,3,4,6};
	System.out.println(oned[4]);
	oned[4]=5;
	for(int i=0;i<oned.length;i++) {
		System.out.println("Elements in Array are : "+oned[i]);
		}

//2.Two Dimensional Array
	int [][]a={{1,2,3},
			{4,5,6},
			{7,8,9},
			{10,11,12}
	};
	System.out.println(a.length);
	System.out.println(a[2][1]);


	}
   }

