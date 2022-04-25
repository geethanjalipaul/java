import java.util.Arrays; 
import java.util.Scanner;
class employee{ 
int eNo,eSalary;
String eName;
public employee(int no,int sal,String name)
{
eNo=no;
eSalary=sal;
eName=name; 
} 
public void showData()
{ 
System.out.println("EmpId="+eNo +""+"Name="+eName +""+"Salary="+eSalary);
System.out.println();
}
} 
public class EmpArrObjects 
{ 
public static void main(String args[])
{ 
System.out.print("Enter number of employees :"); 
Scanner sc=new Scanner(System.in); 
int n= sc.nextInt(); 
System.out.println("Enter Employee details one by one");
employee employees[]=new employee[n];
Scanner scemp=new Scanner(System.in);
int eid , esal ; 
String ename;
for( int i=0;i<n;i++)
{ 
System.out.println("Enter"+i+"employee details"); 
System.out.println("Enter employee id(integer):"); 
eid=scemp.nextInt (); 
System.out.println("Enter employee name(String):"); 
String name= scemp.next (); 
ename=new String(name); 
System.out.println("Enter employee salary(integer): " );
esal=scemp.nextInt();
employee emp=new employee(eid,esal,ename); 
employees[i]=emp;
} 
System.out.println("Employees are:\n" ); 
for(employee y:employees) 
y.showData();
System.out.println("Enter employee number to search:"); 
int semp=sc.nextInt();
boolean found=false; 
for(employee e:employees)
{ 
if(semp==e.eNo)
{ 
found=true; 
System.out.println("Employee found."); 
e.showData(); 
break; 
}
} 
if(!found)
{ 
System.out.println("Employee not found.");
}
}
}