package OODPg5;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
	private String name;
	private long contact;
	private ArrayList<Discount> discount = new ArrayList<Discount>();
	
	Customer(){//constructor
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter name of customer:");//get name and contacts for customer
		name = s.nextLine();
		System.out.println("Enter contacts:");
		while((contact = s.nextLong())<100000000 || contact >99999999) {
			System.out.println("Enter an 8 digit number!");
		};
	}
	Customer(String n,long c){
		name = n;
		contact = c;
	}
	public void setDiscount(Discount d) {
		discount.add(d);
	}
	public double getDiscount(double price) {
		if(discount.size()==0) return 0;
		double highest_discount=0;
		for(int i=0;i<discount.size();i++) {
			if(discount.get(i).getDiscount()>highest_discount)
				highest_discount = discount.get(i).getDiscount();
		}
		return highest_discount;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public long getContactNo() {
		return contact;
	}
	public void setContact(long c) {
		if(c<100000000 && c >99999999)
			contact = c;
		else
			System.out.println("invalid contacts!");
	}
}