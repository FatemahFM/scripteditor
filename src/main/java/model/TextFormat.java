/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Fatem
 */
public abstract class TextFormat {
    public boolean setLeft;
    public String fontType;
    public boolean isBold;
    public boolean isItalic;
    public double leftMargin;
    public double rightMargin;
    public String text;

    public TextFormat(boolean setLeft, String fontType, boolean isBold, boolean isItalic, double leftMargin, double rightMargin, String text) {
        
        this.setLeft = true;
        
        //this is the style of the text
        this.fontType = "Courier Prime";
        this.isBold = false;
        this.isItalic = false;
        
        // this is the location of the text
        this.leftMargin = 1.5;
        this.rightMargin = 1;
        
        this.text = text;
    }
    
    public String toString() {
        return text;
    }
}
