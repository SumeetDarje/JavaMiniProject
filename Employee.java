import java.util.Scanner;

import java.util.Vector;

public class Employee {

Vector v=new Vector();
	
Scanner s=new Scanner(System.in);
	
void accept() {
		
int ch,id = 0,sal=0,hra,pf,da,gsal,nsal;
String fname = null,mname = null,lname=null;
		
while(true)
{
System.out.println("----------------------"); 
System.out.println("ENTER EMPLOYEE DETAILS");
System.out.println("----------------------\n\n");
			
System.out.println("1) ENTER EMPLOYEE DETAILS");
System.out.println("2) EDIT EMPLOYEE NAME");
System.out.println("3) DISPLAY EMPLOYEE DETAILS");
System.out.println("4) EXIT");
System.out.println("ENTER YOUR CHOICE FROM ABOVE OPTION:");
ch=s.nextInt();
			
switch(ch) {
			
case 1:
System.out.println("Enter your ID:");
id=s.nextInt();
System.out.println("Enter your First Name"+" "+"Middle name"+" "+"Last name");
fname=s.next();
mname=s.next();
lname=s.next();
System.out.println("Enetr your Salary:");
sal=s.nextInt();
break;
		    	
case 2:
System.out.println("YOU CAN EDIT NAME HERE");
System.out.println("ENTER THE CORRECT NAME YOU WANT TO EDIT");
v.addElement(fname);
v.addElement(mname);
v.addElement(lname);
System.out.println("CURRENT NAME:"+v);
v.removeElement(fname);
System.out.println("ENTER NEW NAME:");
fname=s.next();
mname=s.next();
lname=s.next();
System.out.println("NEW NAME:"+fname+" "+mname+" "+lname);
break;
		
case 3:
System.out.println("ID:"+id);
System.out.println("NAME:"+fname+" "+mname+" "+lname);
hra=12*sal;
da=8*sal;
pf=6*sal;
gsal=hra+da+sal;
nsal=gsal-pf;
System.out.println("GROSS SALARY:"+gsal);
System.out.println("SALARY:"+nsal);
break;
		   
case 4:
System.out.println("THANK YOU FOR BEING EMPLOYEE IN PATIL COMPANY");
System.exit(0);
break;
			
default:
System.out.println("ENTER CORRECT CHOICE");
				
}
			
}
		
}
	
public static void main(String[] args) {

Employee e=new Employee();

e.accept();

}

}

