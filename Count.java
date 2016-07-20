# wordscount
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
        String str=sc.nextLine();
        String[] str1=str.split("\\s");
        int Count=str1.length;
        System.out.println(Count);
        
	}

}
