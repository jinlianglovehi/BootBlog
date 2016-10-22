package com.huadou.cn.editormd.mapper;

import com.huadou.cn.plateform.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by jinliang on 16/10/22.
 */

@Mapper
public interface EditorMdMapper {

    /**
     *  根据名字 查看用户信息
     * @param username
     * @return
     */
    @Select("SELECT * FROM userinfo WHERE username = #{username}")
    User findByName(@Param("username") String username);

    /**
     * 插入用户信息
     * @param username
     * @param age
     * @return
     */
    @Insert("INSERT INTO userinfo(username, AGE) VALUES(#{username}, #{age})")
    int insert(@Param("username") String username, @Param("age") Integer age);

}
