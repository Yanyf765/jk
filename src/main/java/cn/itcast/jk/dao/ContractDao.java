package cn.itcast.jk.dao;

import java.util.Map;

import cn.itcast.jk.domain.Contract;
/**
 * @Description 购销合同数据访问层接口
 * @author Administrator
 * @CreateDate 2017年12月25日
 */
public interface ContractDao extends BaseDao<Contract>{
	public void updateState(Map map);//修改状态
}
