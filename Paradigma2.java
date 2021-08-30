public class Paradigma2{
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        
        Auto.acelerar();
        
        System.out.println("-- auto1 --");
        Auto auto1=new Auto("VW","Gol","Blanco");
        //auto1.acelerar();			//10
        //auto1.acelerar();			//20
        Auto.acelerar();
        System.out.println(auto1.getEstado()+", "+Auto.getVelocidad());
        
        Auto auto2=new Auto("Citroen","C4","Bordo");
        auto2.acelerar();			//30
        System.out.println(auto2.getEstado()+", "+Auto.getVelocidad());
        System.out.println(auto1.getEstado()+", "+Auto.getVelocidad());
    }
}

class Auto{
	private String marca;
	private String modelo;
	private String color;
	private static int velocidad;
	
	public Auto(String marca, String modelo, String color){
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	public String getEstado(){
		return marca+", "+modelo+", "+color;
	}
	
	public static void acelerar(){
		velocidad = velocidad + 10;
	}
	
	public static void frenar(){
		velocidad = velocidad - 10;
	}
	
	public static int getVelocidad(){
		return velocidad;
	}
}
