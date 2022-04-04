
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author minaawad
 */ //bruhf
public class Line extends Shape {
    int StartX, StartY, endX, endY, Border_Thickness, Colour;

    public Line(int StartX, int StartY, int endX, int endY, int Border_Thickness, int Colour) {
        this.StartX = StartX;
        this.StartY = StartY;
        this.endX = endX;
        this.endY = endY;
        this.Border_Thickness = Border_Thickness;
        this.Colour = Colour;
    }

    
    
    public void setEndX(int endX) {
        this.endX = endX;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public void setBorderthickness(double borderthickness) {
        this.borderthickness = borderthickness;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    //colors are R, G, B 
    //don't know if it should be in String 
    
    Line()
    {
        
    }
    
    public void Line()
    {
        
    }
}
