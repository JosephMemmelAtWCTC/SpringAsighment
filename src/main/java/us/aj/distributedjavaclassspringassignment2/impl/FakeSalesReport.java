package us.aj.distributedjavaclassspringassignment2.impl;

import us.aj.distributedjavaclassspringassignment2.Sale;
import us.aj.distributedjavaclassspringassignment2.iface.SalesReport;

import java.util.List;

public class FakeSalesReport implements SalesReport {
	@Override
	public void generateReport(List<Sale> salesList) {
		System.out.println("Generated Report");
		for(Sale sale: salesList){
			System.out.println(sale);
		}
	}
}
