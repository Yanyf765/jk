package cn.itcast.jk.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.itcast.jk.dao.FactoryDao;
import cn.itcast.jk.domain.Factory;

/**
 * @Description 生产厂家数据访问层实现类
 * @author Administrator
 * @CreateDate 2017年12月25日
 */
@Repository
public class FactoryDaoImpl extends BaseDaoImpl<Factory> implements FactoryDao{
	public FactoryDaoImpl() {
		//设置命名空间
		super.setNs("cn.itcast.jk.mapper.FactoryMapper");
	}

	public void updateState(Map map) {
		super.getSqlSession().update(super.getNs()+".updateState", map);
	}
}
