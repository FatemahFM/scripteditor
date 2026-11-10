/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Fatem
 */
public class SettingFormat extends TextFormat {
    
    public boolean bool;

    public SettingFormat(boolean bool, boolean setLeft, String fontType, double leftMargin, double rightMargin, String text) {
        super(setLeft, fontType, 0, rightMargin, text);
        this.bool = bool;
    }
    
    public String location(boolean bool) {
        if (bool) {
            return "INT. - ";
        } else {
            return "EXT. - ";
        }
    }
    
    @Override
    public String toString() {
        return location(bool) + text;
    }
    
}
