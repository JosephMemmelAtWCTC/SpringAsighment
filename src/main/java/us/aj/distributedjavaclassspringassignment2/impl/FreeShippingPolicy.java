package us.aj.distributedjavaclassspringassignment2.impl;

import us.aj.distributedjavaclassspringassignment2.Sale;
import us.aj.distributedjavaclassspringassignment2.iface.ShippingPolicy;

import java.util.List;

public class FreeShippingPolicy implements ShippingPolicy {
	@Override
	public void applyShipping(List<Sale> sales) {
		for(Sale sale: sales){
			sale.setShipping(0D);
		}
	}
}
