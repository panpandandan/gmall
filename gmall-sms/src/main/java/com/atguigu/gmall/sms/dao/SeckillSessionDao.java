package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author panpan
 * @email pp@atguigu.com
 * @date 2019-12-10 08:47:44
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
