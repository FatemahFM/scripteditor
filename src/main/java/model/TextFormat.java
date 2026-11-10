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
    public int leftMargin;
    public int rightMargin;
    public String text;

    public TextFormat(boolean setLeft, String fontType, int leftMargin, int rightMargin, String text) {
        this.setLeft = setLeft;
        this.fontType = fontType;
        this.leftMargin = leftMargin;
        this.rightMargin = rightMargin;
        this.text = text;
    }
}
