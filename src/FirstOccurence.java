import java.util.Scanner;
public class FirstOccurence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		 System.out.println("Enter the string"); 
		 String str = s.nextLine(); 
		 char x,y; 
		 System.out.println("Enter the character to be searched:"); 
		 x=s.next().charAt(0); 
		 System.out.println("Enter the character to replace:"); 
		 y=s.next().charAt(0); 
		 int index=0; 
		 int flag = 0; 
		 for(int i=0;i<str.length();i++) { 
		 if(str.charAt(i)==x) { 
		 index = i; 
		 flag = 1; 
		 break; 
		 } 
		 } 
		 if(flag==0) { 
		 System.out.println("character not found"); 
		 return; 
		 } 
		 System.out.println(str.substring(0,index)+y+str.substring(index+1)); 
	}

}
