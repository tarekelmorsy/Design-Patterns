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
public interface Image extends  Poolable{
    
    void draw();

    String getLocation();

    void setLocation(String location);
}
