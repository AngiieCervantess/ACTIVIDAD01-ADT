/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act013d;

/**
 *
 * @author Lab Interfaces
 */
public class Triangulo {  //atributos
    
    public double base;
    public double altura;
    public double hipotenusa;
    public double sen;
    public double csen;
    public double tan;
    public double perimetro;
    public double area; 
    
    //constructor
    
    
    public Triangulo (double base, double altura, double hipotenusa, double sen, double csen, double tan, double perimetro, double area) {
       
        //Diferenciar las variables d elos atributos.
        
        this.base = base;
        this.altura=altura;
        this.hipotenusa=hipotenusa;
        this.sen=sen;
        this.csen=csen;
        this.tan=tan;
        this.perimetro=perimetro;
        this.area=area; 
    }
    
    
    //setters y Getters

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    public double getSen() {
        return sen;
    }

    public void setSen(double sen) {
        this.sen = sen;
    }

    public double getCsen() {
        return csen;
    }

    public void setCsen(double csen) {
        this.csen = csen;
    }

    public double getTan() {
        return tan;
    }

    public void setTan(double tan) {
        this.tan = tan;
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
