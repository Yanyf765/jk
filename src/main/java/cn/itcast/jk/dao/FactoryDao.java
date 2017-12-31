package cn.itcast.jk.dao;

import java.util.Map;

import cn.itcast.jk.domain.Factory;

/**
 * @Description 生产厂家数据访问层接口
 * @author Administrator
 * @CreateDate 2017年12月25日
 */
public interface FactoryDao extends BaseDao<Factory> {
	public void updateState(Map map);			//修改状态
}
