/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act013d;
 
//Publico la puedes ver en la misma clase, en otras clases y en el proyecto
//Privado nadmas la puedes ver en la misma clase en la que estas, no la puedes ver en otras clases ni en otros proyectos
//Protected La podemos ver en la misma clase pero la puedes heredar y acceder a sus atributos y metodos

//Los dos se pueden heredar pero los Protected los hace protegidos, que no se pueden ver en todas las clases

//UnMetodo se diferencia porque tiene dos parentesis juntos. ejemplo Circulo();

/**
 *
 * @author Lab Interfaces
 */
public class Circulo {
    
  //Atributos: caracteristicas del objeto
   
    public double radio ;
    public double perimetro;
    public double area;
    
    //Constructor: Vamos a construir el objeto a base de esos atributos
    
    public Circulo(double radio, double perimetro, double area) { 
     
        //This.radio es del atributo y el = radio sin color es lo que esta recibiendo.
        
        this.radio = radio; 
        this.perimetro = perimetro;
        this.area = area;
    }
    
    //getters y setters Clic derecho/insert Code/Getters and Setterers 

    public double getRadio() { //Dame el radio
        return radio;   //regresame el radio
    }

    public void setRadio(double radio) {  //modificar ese radio
        this.radio = radio; //obtener el nuevo radio
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    } 
    
}
