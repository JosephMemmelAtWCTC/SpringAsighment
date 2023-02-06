package us.aj.distributedjavaclassspringassignment2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import us.aj.distributedjavaclassspringassignment2.iface.SalesInput;
import us.aj.distributedjavaclassspringassignment2.iface.SalesReport;
import us.aj.distributedjavaclassspringassignment2.iface.ShippingPolicy;
import us.aj.distributedjavaclassspringassignment2.impl.*;

@Configuration
@ComponentScan("us.aj.distributedjavaclassspringassignment2")
public class AppConfig {
	@Bean
	public SalesInput salesInput() {
//		return new FakeSalesInput();
//		return new ConsoleSalesInput();
		return new FileSalesInput();
	}

	@Bean
	public SalesReport salesReport(){
//		return new FakeSalesReport();
//		return new SummerySalesReport();
		return new DetailedSalesReport();
	}

	@Bean
	public ShippingPolicy shippingPolicy(){
//		return new FakeShippingPolicy();
//		return new FreeShippingPolicy();
//		return new FlateRateDomesticShippingPolicy();
		return new FreeShippingOverShippingPolicy(50.00);
	}
}
