
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author minaawad
 */
public class Circle extends Shape{
    
    private int r;

    public void setR(int r) {
        this.r = r;
    }

    public void setColour(int r, int g, int b){
        this.colour = new Color(r,g,b);
    }

    public void setBorderColor(int r, int g, int b) {
        this.borderColor = new Color(r,g,b);
    }

    public void setBorderthickness(double borderthickness) {
        this.borderthickness = borderthickness;
    }
   
    
    
    Circle(){
        
    }
    
    public void Circle(){
        
        
    }
}
