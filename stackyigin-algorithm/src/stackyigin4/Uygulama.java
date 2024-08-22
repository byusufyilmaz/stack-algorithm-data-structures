package stackyigin4;

public class Uygulama {

	public static void main(String[] args) {
		Stackyigin sy = new Stackyigin(5);
		sy.push(1);
		sy.push(2);
		sy.push(3);
		sy.push(4);
		sy.push(5);
		
		sy.pop();
		sy.pop();
		
		sy.kacelemanvar();
		
		sy.yazdır();
	}

}
