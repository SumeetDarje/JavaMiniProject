import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banking {

	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	
	int ch;
	double bal,cbal,dbal,acc;
	String name;
	
	void accept() throws Exception, IOException {
		
		while(true) {
			System.out.println("----------------------");
			System.out.println("WELCOME TO PATIL BANK");
		    System.out.println("----------------------\n\n");
			
			System.out.println("1) ENTER YOUR DETAILS");
			System.out.println("2) CREDIT YOUR BALANCE");
			System.out.println("3) DEBIT YOUR BALANCE");
			System.out.println("4) EXIT");
			System.out.println("Enter your choice:");
			ch=Integer.parseInt(b.readLine());
		    
            switch(ch) {
            
            case 1:
            	System.out.println("Enter your name:");
                name=b.readLine();
                System.out.println("Enter your account number:");
                acc=Double.parseDouble(b.readLine());
                System.out.println("Enter your balance:");
                bal=Double.parseDouble(b.readLine());
                System.out.println("NAME: "+name);
                System.out.println("ACCOUNT NUMBER: "+acc);
                System.out.println("BALANCE: "+bal);
                
                break;
                
            case 2:
            	System.out.println("Enter your balance:");
            	bal=Double.parseDouble(b.readLine());
                System.out.println("Enter the amount you want to credit in your current balance: ");
            	cbal=Double.parseDouble(b.readLine());
            	System.out.println("BEFORE CREDIT BALANCE: "+bal);
            	System.out.println("CREDIT BALANCE: "+(cbal+bal));
            	
            	break;
            	
            case 3:
            	System.out.println("Enter your balance:");
            	bal=Double.parseDouble(b.readLine());
                System.out.println("Enter the amount you want to debit from your current balance: ");
            	dbal=Double.parseDouble(b.readLine());
            	System.out.println("BEFORE DEBIT BALANCE: "+bal);
            	System.out.println("DEBIT BALANCE: "+(dbal-bal));
            	
            	break;
            	
            case 4:
				System.out.println("THANK YOU FOR VISITING PATILS BANK");
				System.exit(0);

			default:
				System.out.println("PLEASE SELECT A VALID CHOICE");
            }
		    
		}
		
	}
	
	
	public static void main(String[] args) throws IOException, Exception {

		Banking b=new Banking();
		b.accept();
	}

}
