/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.diogo.classes;

import java.awt.Desktop;  

import java.io.*;  

/**
 *
 * @author Diogo
 */
public class abrirMainTeste 
{
    public static void main(String[] args) 
    {
        try 
        {
            Runtime runTime = Runtime.getRuntime();
            
            String executablePath = "C:\\Program Files\\Aseprite\\aseprite.exe";
            
            Process process = runTime.exec(executablePath);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
