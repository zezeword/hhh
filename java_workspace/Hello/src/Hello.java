import java.util.Scanner;


public class Hello { //모든건 클래스&함수안에!! 
	
	String name="";
	
	/*public static void printName() {
		System.out.println("printName method");
	}
	*/
	public static void main(String[] args) {//static 메소드
		// TODO Auto-generated method stub
		
		int value1 = Integer.parseInt("10");
		
		System.out.println("value1 : " + value1);
		String str1 = String.valueOf(10);
		System.out.println("str 1: "+str1);
		
		/*System.out.println("Hello Java");
		printName(); //non static 메소드 호출
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String str1 = scanner.next();
		System.out.println(str1);
		
		//scanner.nextLine();
		
		System.out.print("Enter a single line of string");
		String lineString = scanner.nextLine();
		
		scanner.close();
		System.out.println("Exit Program");
		*/
	}
	
}

