package evolution;

import evolution.dao.AnyDao;
import evolution.entity.AnyEntity;

public class Application {
	public static void main(String[] args) {
		AnyDao anyDao = new AnyDao();	
		AnyEntity anyEntity = anyDao.selectById(1);
		System.out.println(anyEntity);
	}
}
