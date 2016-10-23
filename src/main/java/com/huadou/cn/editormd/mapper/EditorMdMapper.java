package com.huadou.cn.editormd.mapper;

import com.huadou.cn.editormd.model.EditorMdModel;
import com.huadou.cn.plateform.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by jinliang on 16/10/22.
 *
 *   editormd markdown 文档的处理的工具类的文件
 */

@Mapper
public interface EditorMdMapper {

    @Select("SELECT * FROM markmdmodel WHERE id = #{id}")
    EditorMdModel findByName(@Param("id") String id);


    @Insert("INSERT INTO markmdmodel(markmd) VALUES(#{markmd})")
    int insert(@Param("markmd") String markmd);

}
