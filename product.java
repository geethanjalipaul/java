import java.util.*;
public class product
{
static Product(String pname,String pcode,int price)
{
this.pname=pname ;
this.pcode=pcode ;
this. price=price;
}

public static void main(String args[])
{
Product p1=new Product("Benz","Car123",100000);
System.out.println("*****Displaying product1*****") ;
p1.display();

Product p2 = new Product("Jaguar","Car426",250000);
System.out.println("*****Displaying product2*****");
p2.display();

Product p3 = new Product("Maruthi","Car800",500000);
System.out.println("*****Displaying product3*****");
p3.display();

Product p=p3.getPrice()<(p1.price<p2.price? p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
System.out.println("\n******Displaying product with the lowest price******");
p.diplay();
}
}