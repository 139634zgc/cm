package com.bitauto.bdc.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bitauto.bdc.modules.sys.entity.SysLogEntity;

/**
 * 系统日志
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-08 10:40:56
 */
@Mapper
public interface SysLogDao extends BaseDao<SysLogEntity> {
	
}
