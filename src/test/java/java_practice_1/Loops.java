package java_practice_1;
public class Loops {
public static void main(String[] args) {	
//For Loop	
int i;
for(i=1;i<=5;i++) {
	System.out.println("For Loop " + i);
}
	System.out.println("outside for loop value of i is " + i);
//Nested For Loop

for(int x=1;x<=5;x++) {
	for(int y=1;y<=5;y++) {
	//	System.out.println("Outer Loop Value is:"+ x + "------Inner loop value is:" +y);
		
	}
}
//While Loop
int k=1;
while(k<=3) {
//	System.out.println("While Loop value of k is "+ k);
	k++;
}
//System.out.println("outside while loop value of k is--" + k);
}
}
