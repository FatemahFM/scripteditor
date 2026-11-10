/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scripteditior;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Fatem
 */
public class TextEditor extends JFrame implements ActionListener{
    
    JTextArea textarea;
    JScrollPane scrollpane;
    
    TextEditor() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Spectrum Project app");
        this.setSize(500, 400);
        this.setLayout(new FlowLayout());
        
        //delete this later when you make the thing finally fullscreen
        this.setLocationRelativeTo(null);
        
        textarea = new JTextArea();
        this.add(textarea);
        textarea.setPreferredSize(new Dimension(450,350));
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setFont(new Font("Courier Prime", Font.PLAIN, 20));
        
        scrollpane = new JScrollPane(textarea);
        scrollpane.setPreferredSize(new Dimension(450,350));
        scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        this.add(scrollpane);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
