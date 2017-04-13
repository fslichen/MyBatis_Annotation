package evolution.dao;

import org.apache.ibatis.session.SqlSession;

import evolution.entity.AnyEntity;
import evolution.mapper.AnyMapper;
import evolution.util.AnyUtil;

public class AnyDao {
	public void save(AnyEntity anyEntity){
		SqlSession session = AnyUtil.getSqlSessionFactory().openSession();	
		AnyMapper mapper = session.getMapper(AnyMapper.class);
		mapper.insert(anyEntity);
		session.commit();
		session.close();
	}
	
	public void update(AnyEntity village){
		SqlSession session = AnyUtil.getSqlSessionFactory().openSession();	
		AnyMapper mapper = session.getMapper(AnyMapper.class);
		mapper.update(village);
		session.commit();
		session.close();
	}
	
	public void delete(Integer id){
		SqlSession session = AnyUtil.getSqlSessionFactory().openSession();	
		AnyMapper mapper = session.getMapper(AnyMapper.class);
		mapper.deleteById(id);
		session.commit();
		session.close();
	}
	
	public AnyEntity selectById(Integer id) {
		SqlSession session = AnyUtil.getSqlSessionFactory().openSession();	
		AnyMapper mapper = session.getMapper(AnyMapper.class);
		AnyEntity village = mapper.selectById(id);
		session.close();
		return village;
	}
}
