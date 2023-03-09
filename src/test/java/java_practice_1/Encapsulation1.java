package java_practice_1;
public class Encapsulation1 {
	private int a;
	public static void main(String[] args) {
		
}
	public int showvalue() {         //renamed auto created getter method
		return a;
	}
	public void givevalue(int a) {    //renamed auto created setter method

		this.a = a;
	}
	
}

