import java.util.Scanner;

public class Braces {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int number = scanner.nextInt();

	    if (number > 0 && number <= 15) {
	    	for(int i = 0; i < number; i++){
		        String currentString = scanner.next();
		        int length = currentString.length();
		        
		        if (length > 0 && length <= 100) {
		        	while(true){
			            currentString = currentString.replaceAll("\\(\\)","");
			            currentString = currentString.replaceAll("\\{\\}","");
			            currentString = currentString.replaceAll("\\[]","");
			            currentString = currentString.trim();
			            
			            if(currentString.length() == length)
			                break;
			            else if(currentString.length() == 0)
			                break;
			            length = currentString.length();
			        }
			        
			        if(currentString.length() == 0) {
			            System.out.println("YES");
			        }
			        else {
			        	System.out.println("NO");	
			        }
				}
		    }
		}
	}

}
