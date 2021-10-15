
public class TaxCalculator {
	public double impuestoPais(String country) {
	    	double impuesto=0;
	    	
	    	if (country == "MX") {
	            impuesto= 0.16;
	        }
	        else if (country == "US") {
	        	impuesto= 0.07;
	        }
	        else if (country == "EU") {
	        	impuesto= 0.21;
	        }
	        else if (country == "JP") {
	        	impuesto= 0.10;
	        }
	    	
	    	return impuesto;
	    }
}
