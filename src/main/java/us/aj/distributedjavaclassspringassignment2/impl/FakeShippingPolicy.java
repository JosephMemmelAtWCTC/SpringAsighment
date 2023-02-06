package us.aj.distributedjavaclassspringassignment2.impl;

import us.aj.distributedjavaclassspringassignment2.Sale;
import us.aj.distributedjavaclassspringassignment2.iface.ShippingPolicy;

import java.util.List;

public class FakeShippingPolicy implements ShippingPolicy {
	@Override
	public void applyShipping(List<Sale> sale) {
		System.out.println("Applied Shipping");
	}
}
