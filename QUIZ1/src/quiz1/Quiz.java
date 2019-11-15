package quiz1;
import java.util.Scanner;
import java.util.Arrays;

public class Quiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		neil neilObject = new neil();
		
		
		System.out.println("Enter First Name: ");
		String temp =input.nextLine();
		neilObject.setFirstname(temp);
		
		System.out.println("Enter Middle Name: ");
		String temp2 =input.nextLine();
		neilObject.setMiddlename(temp2);
		
		System.out.println("Enter Last Name: ");
		String temp3 =input.nextLine();
		neilObject.setLastname(temp3);
		
		System.out.println("Enter address: ");
		String temp4 =input.nextLine();
		neilObject.setAddress(temp4);
		
		System.out.println("Enter age: ");
		int temp5 =input.nextInt();
		neilObject.setAge(temp5);
		
		System.out.print("Number of  Vowels in the string: " + countVowels(temp)+"\n");
		System.out.print("Number of  Vowels in the string: " + countVowels(temp2)+"\n");
		System.out.print("Number of  Vowels in the string: " + countVowels(temp3)+"\n");
		System.out.print("Number of  Vowels in the string: " + countVowels(temp4)+"\n");
		System.out.print("Total of Vowels: " );
		System.out.println( countVowels(temp) + countVowels(temp2)+countVowels(temp3)+countVowels(temp4));
		
		
		
		
		
		int n1=0,n2=1,n3,i,count=10;    
		System.out.println(n1);  
		System.out.println(n2);      
		for(i=2;i<count;++i){
			n3=n1+n2;       
			n1=n2;    
			n2=n3;
			if(n3 % 2 == 0){
				System.out.println(n3 + "\n" + "Even! " + (temp3)+(temp5));
			}
	        else
	            System.out.println(n3 + "\n" + "Odd! ");
			}
		}
		
	
	
	
		public static int countVowels(String name){
			int count = 0;
			for (int i = 0; i < name.length(); i++){
				if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u')
				{
                count++;
				}
       	}
        return count;
    }
}


