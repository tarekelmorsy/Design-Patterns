/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

/**
 *
 * @author tarek
 */
public class ObjectPool <T extends Poolable>{
    	private BlockingQueue<T> availablePool;
        
        public ObjectPool(Supplier<T> creator, int count) {
		availablePool = new LinkedBlockingQueue<>();
		for(int i=0; i< count;i++) {
			availablePool.offer(creator.get());
		}
	}
        public T get() {
		try {
			return availablePool.take();
		}catch(InterruptedException ex) {
			System.err.println("take() was interrupted"); 
		}
		return null;
	}
	
	public void release(T obj) {
		obj.reset();
		try {
			availablePool.put(obj);
		} catch (InterruptedException e) {
			System.err.println("put() was interrupted"); 
		}
	}
    
}
