package us.aj.distributedjavaclassspringassignment2.impl;

import us.aj.distributedjavaclassspringassignment2.Sale;
import us.aj.distributedjavaclassspringassignment2.iface.SalesReport;

import java.util.List;

public class SummerySalesReport implements SalesReport {
	@Override
	public void generateReport(List<Sale> salesList) {
		System.out.println("Starting report caculations...");
		double priceTotal = 0, taxTotal = 0, shippingFeeTotal = 0;
		for(Sale sale: salesList){
			priceTotal += sale.getPrice();
			taxTotal += sale.getTax();
			shippingFeeTotal += sale.getShipping();
		}
		System.out.println(" --{: SALES SUMMARY REPORT :}--");
		System.out.format("%8s %8s %8s %8s", "Total", "Tax", "Shipping", "Sales");
		System.out.println();
		System.out.format("%8.2f %8.2f %8.2f %3d", priceTotal, taxTotal, shippingFeeTotal, salesList.size());
	}
}
