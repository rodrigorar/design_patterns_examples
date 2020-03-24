package com.rodrigorar.creational;

import com.rodrigorar.creational.object_pool.Resource;
import com.rodrigorar.creational.object_pool.ObjectPool;

public class ObjectPoolPattern {
	public static void main(String[] args) {
		ObjectPool pool = ObjectPool.getInstance();
		Resource resource1 = null;
		Resource resource2 = null;
		Resource resource3 = null;
		Resource resource4 = null;
		try {
			resource1 = pool.acquire(); // 2 available
			resource1.process("Processing for Resource 1");
			resource2 = pool.acquire(); // 1 available
			resource2.process("Processing for Resource 2");
			pool.release(resource2); // 2 available
			resource3 = pool.acquire(); // 1 available
			resource3.process("Processing for Resource 2 Again");
			resource4 = pool.acquire();
			pool.acquire(); // Error
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (resource1 != null) {
				pool.release(resource1);
			}
			if (resource3 != null) {
				pool.release(resource3);
			}
			if (resource4 != null) {
				pool.release(resource4);
			}
		}
	}
}
