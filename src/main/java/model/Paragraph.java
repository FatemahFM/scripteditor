/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Fatem
 */
public class Paragraph extends TextFormat{
    
    public Paragraph(boolean setLeft, String fontType, boolean isBold, boolean isItalic, double leftMargin, double rightMargin, String text) {
        super(setLeft, fontType, true, isItalic, 3, rightMargin, text);
    }
    
    @Override
    public String toString() {
        return text.toUpperCase();
    }
}
