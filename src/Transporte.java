
public class Transporte {
	private Engine engine;
	private Driver driver;
	
	public Transporte(Engine engine,Driver driver) {
		this.engine=engine;
		this.driver=driver;
		
	}
	
	
	public void deliver(String carga,String destino) {
		this.driver.navigate();
		this.engine.move();
		
		System.out.println("se entregó "+carga+" en el destino "+destino);
	}
}
