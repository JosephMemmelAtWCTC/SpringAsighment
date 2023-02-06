package us.aj.distributedjavaclassspringassignment2.impl;

import us.aj.distributedjavaclassspringassignment2.Sale;
import us.aj.distributedjavaclassspringassignment2.iface.SalesInput;

import java.util.ArrayList;
import java.util.List;

public class FakeSalesInput implements SalesInput {
	@Override
	public List<Sale> getSales() {
		System.out.println("Got a sale");
		List<Sale> theList = new ArrayList<>();
		theList.add(new Sale("Bob Bobbinson", "Texas", 42.42, 23.32));
		theList.add(new Sale("Boaty McBoatface", "Null Island", 1.2, 3.4));
		return theList;
	}
}
