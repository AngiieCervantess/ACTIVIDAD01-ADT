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
public class Plano3D {
    
    public double x;
    public double y;
    public double z;
    public double dimension;
    
    //constructor
    
    public Plano3D (double x, double y, double z, double dimension) {
        
        //diferenciar los atributos
        
        this.x=x;
        this.y=y;
        this.z=z;
        this.dimension=dimension;
    }
    
    //Setters and Getters 

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }
    
    
}
