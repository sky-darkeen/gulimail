package com.gulimail.product.dao;

import com.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author skydraggern
 * @email skydraggern@gmail.com
 * @date 2021-08-24 17:19:09
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
