package com.uapa.software.repositories;

import java.util.List;

public class GenericRepository<Entity> implements IRepository<Entity> {
	
	@Override
	public Entity saveEntity(Entity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEntity(Entity entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEntity(Entity entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Entity getEntityById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entity> getEntities() {
		// TODO Auto-generated method stub
		return null;
	}

}
