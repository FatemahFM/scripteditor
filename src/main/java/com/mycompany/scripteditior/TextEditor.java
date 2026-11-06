/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scripteditior;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Fatem
 */
public class TextEditor extends JFrame implements ActionListener{
    
    JTextArea textarea;
    
    TextEditor() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Spectrum Project app");
        this.setSize(500, 400);
        this.setLayout(new FlowLayout());
        
        //delete this later
        this.setLocationRelativeTo(null);
        
        textarea = new JTextArea();
        this.add(textarea);
        textarea.setPreferredSize(new Dimension(450,350));
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
