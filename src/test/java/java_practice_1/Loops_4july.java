package java_practice_1;
public class Loops_4july {
public static void main(String[] args) {	
//For Loop	
int i;
for(i=1;i<=5;i++) {
	//System.out.println("For Loop");
}
//Nested For Loop
int x; int y;
for(x=1;x<=5;x++) {
	for(y=1;y<=5;y++) {
		System.out.println("Outer Loop Value is:"+ x + "------Inner loop value is:" +y);
		
	}
}
//While Loop
int k=1;
while(k<=3) {
	//System.out.println("While Loop");
	k++;
}
}
}
