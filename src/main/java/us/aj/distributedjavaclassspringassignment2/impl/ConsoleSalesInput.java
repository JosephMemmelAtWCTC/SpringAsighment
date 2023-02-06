package us.aj.distributedjavaclassspringassignment2.impl;

import us.aj.distributedjavaclassspringassignment2.Sale;
import us.aj.distributedjavaclassspringassignment2.iface.SalesInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleSalesInput implements SalesInput {

	@Override
	public List<Sale> getSales() {
		List<Sale> theSales = new ArrayList<>();
		Scanner in = new Scanner(System.in);

		do{
			String customerName, customerCountry;
			double customerTotal, customerTax;
			System.out.println("Please fill out the following info to add a sale.");
			System.out.print("Customer Name: ");
			customerName = in.nextLine();
			System.out.print("Customer's Country: ");
			customerCountry = in.nextLine();
			System.out.print("Customer's order total: $");
			customerTotal = Double.parseDouble(in.nextLine());
			System.out.print("Customer's tax (in percentage): ");
			customerTax = Double.parseDouble(in.nextLine());

			theSales.add(new Sale(customerName, customerCountry, customerTotal, customerTax));
			System.out.print("Press enter to add more sales or \"q\" to stop adding new sales:");

		}while(!in.nextLine().toLowerCase().equals("q"));
		in.close();
		System.out.println();
		return theSales;
	}

}
