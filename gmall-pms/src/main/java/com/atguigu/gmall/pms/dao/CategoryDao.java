package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author panpan
 * @email pp@atguigu.com
 * @date 2019-12-08 16:49:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
