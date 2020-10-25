/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPool;

import java.awt.geom.Point2D;

/**
 *
 * @author tarek
 */
public class Bitmap implements Image{
    private String location;

    private String name;

    public Bitmap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing "+name+" @ "+location);    }

    @Override
    public String getLocation() {
return location;}

    @Override
    public void setLocation(String location) {

        this.location= location;

    }

    @Override
    public void reset() {
location = null;
		System.out.println("Bitmap is reset");    }
    
}
