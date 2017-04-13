package evolution.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import evolution.entity.AnyEntity;

public interface AnyMapper {
	@Results({
        @Result(property = "id", column = "id"),
        @Result(property = "name", column = "name"),
        @Result(property = "gender", column = "gender")
      })
	@Select("SELECT * from any_entity WHERE id = #{id}")
	public AnyEntity selectById(int id);
	
	@Insert("INSERT into any_entity(name, gender) VALUES(#{name}, #{gender})")
	public void insert(AnyEntity anyEntity);
	
	@Update("UPDATE any_entity SET name = #{name}, gender = #{gender} WHERE id = #{id}")
	public void update(AnyEntity anyEntity);
	
	@Delete("DELETE FROM any_entity WHERE id = #{id}")
	public void deleteById(int id);
}
