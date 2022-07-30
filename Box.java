/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labproject7;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author MaxOnkst
 */
public class Box {
    private int x;
    private int y;
    private int width;
    private int height;
    final int WIDTH = 50;
    final int HEIGHT = 50;
        
    public Box(int x, int y) throws IllegalArgumentException {
        this.x = x;
        this.y = y;
        width = WIDTH;
        height = HEIGHT;
        if(x < 0 || y < 0){
            throw new IllegalArgumentException("Input cannot be negative");
        }
        
    }
    
    public Box(int x, int y, int width, int height) throws IllegalArgumentException{
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        if(x < 0 || y < 0 || width < 0 || height < 0){
            throw new IllegalArgumentException("Input cannot be negative");
        }
    }
    
    public void draw(Graphics g){
        Random rand = new Random();
        Color randcolor = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
        g.setColor(randcolor);
        g.drawRect(x, y, width, height);
    }
}
