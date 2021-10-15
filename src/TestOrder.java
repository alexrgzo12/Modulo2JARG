
public class TestOrder {
	public static void main(String[] args) {
		
		Order orden1=new Order("JP");
		
		
		Item prd1=new Item(1,200,1);
		Item prd2=new Item(2,400,2);
		
		
		orden1.addItem(prd1);
		orden1.addItem(prd2);
		
		System.out.println("el total de la orden es: $"+orden1.getTotal());

		
	}
}
