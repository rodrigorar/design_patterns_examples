package com.rodrigorar.creational.object_pool;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ObjectPool {
	private static ObjectPool _instance;

	private final int poolSize;
	private final Map<UUID, Resource> freePool;
	private final Map<UUID, Resource> aquiredPool;

	private ObjectPool() {
		this.poolSize = 2;
		this.freePool = new HashMap<>();
		this.aquiredPool = new HashMap<>();
	}

	public static ObjectPool getInstance() {
		if (_instance == null) {
			_instance = new ObjectPool();
		}
		return _instance;
	}

	private Resource createNewResource() {
		Resource newResource = new Resource(UUID.randomUUID());
		return newResource;
	}

	private Resource aquireResourceFromPool() {
		Resource resource = freePool.entrySet().iterator().next().getValue();
		freePool.remove(resource.getId());
		aquiredPool.put(resource.getId(), resource);
		return resource;
	}

	public Resource acquire() throws Exception {
		final Resource result;
		if (freePool.isEmpty() && aquiredPool.size() < poolSize) {
			result = createNewResource();
			aquiredPool.put(result.getId(), result);
		} else if (! freePool.isEmpty()) {
			result = aquireResourceFromPool();
		} else {
			throw new Exception("Unable to aquire resource");
		}
		return result;
	}

	public void release(Resource resource) {
		resource.released();
		aquiredPool.remove(resource.getId());
		freePool.put(resource.getId(), resource);
	}
}
