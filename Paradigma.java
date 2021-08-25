import javax.swing.JOptionPane;

//Declaración de clase
public class Paradigma{

    public static void main(String[] args){
        //Punto de entrada
        System.out.println("Hola Mundo!");

        System.out.println("-- auto1 --");
        //creación de un objeto
        Auto auto1=new Auto();      // construyo un Auto

        //coloco estado al objeto (valor a sus atributos)
        auto1.marca="Ford";
        auto1.modelo="Ka";
        auto1.color="Negro";

        //uso de métodos
        auto1.acelerar();       // 10
        auto1.acelerar();       // 20
        auto1.acelerar();       // 30
        auto1.frenar();         // 20

        //imprimir estado de auto1
        System.out.println(auto1.marca+" "+auto1.modelo+" "+auto1.color+" "+auto1.velocidad);

        System.out.println("-- auto2 --");
        Auto auto2=new Auto();
        auto2.marca="Fiat";
        auto2.modelo="Idea";
        auto2.color="Gris";
        auto2.acelerar();
        auto2.acelerar(12);
        System.out.println(auto2.marca+" "+auto2.modelo+" "+auto2.color+" "+auto2.velocidad);
        
        auto2.imprimirVelocidad();
        System.out.println(auto2.obtenerVelocidad());
        JOptionPane.showMessageDialog(null, "Velocidad : "+auto2.obtenerVelocidad());

    }

} //end class Paradigma

class Auto{

    // Atributos
    String marca;
    String modelo;
    String color;
    int velocidad;

    // Métodos
    void acelerar(){
        velocidad=velocidad+10;
    }

    // método con ingreso de parametro
    void acelerar(int kilometros){
        velocidad=velocidad+kilometros;
    }

    void frenar(){
        velocidad=velocidad-10;
    }

    //No retorna valor (void)
    void imprimirVelocidad(){
        System.out.println(velocidad);
    }

    // retorna un valor entero
    int obtenerVelocidad(){
        return velocidad;
    }

} //end class Auto


class Cuenta{
    int nro;
    float saldo;
}

class Cliente{
    String nombre;
    int edad;
    Cuenta cuenta;
}