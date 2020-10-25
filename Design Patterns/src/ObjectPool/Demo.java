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
public class Demo {

    public static final ObjectPool< Bitmap> POOL = new ObjectPool<>(() -> new Bitmap("tarek"), 10);

    public static void main(String[] args) {

        Bitmap b1 = POOL.get();
        b1.setLocation("90");
        Bitmap b2 = POOL.get();
        b2.setLocation("10");
        System.out.println(b1.getLocation());

        b1.draw();
        b2.draw();
        b1.getLocation();

        POOL.release(b1);
        POOL.release(b2);

        POOL.release(b1);
        b1.setLocation("8");
                System.out.println(b1.getLocation());


        POOL.get();
        POOL.get();
        POOL.release(b1);
                System.out.println(b1.getLocation());
b1.reset();
b1.draw();
System.out.println(b1.getLocation());

        System.out.println((b1 = POOL.get()).getLocation());

    }
}
