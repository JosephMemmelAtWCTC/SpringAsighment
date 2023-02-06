package us.aj.distributedjavaclassspringassignment2.impl;

import us.aj.distributedjavaclassspringassignment2.Sale;
import us.aj.distributedjavaclassspringassignment2.iface.SalesReport;

import java.util.List;

public class DetailedSalesReport implements SalesReport {
	@Override
	public void generateReport(List<Sale> salesList) {
		System.out.println(" --{: SALES SUMMARY REPORT :}--");
		System.out.format("%20s %15s %8s %8s %8s %8s", "Customer", "Country", "Amount", "Tax", "Shipping", "Sale #");

		int saleNumber = 0;
		for(Sale sale: salesList){
			System.out.println();
			System.out.format("%20s %15s %8.2f %8.2f %8.2f %3d", sale.getName(), sale.getCountryName(), sale.getPrice(), sale.getTax(), sale.getShipping(), ++saleNumber);
		}
	}
}
