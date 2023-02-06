package us.aj.distributedjavaclassspringassignment2.iface;

import us.aj.distributedjavaclassspringassignment2.Sale;

import java.util.List;

public interface ShippingPolicy {
	void applyShipping(List<Sale> sales);
}
