package cn.itcast.jk.dao.impl;

import java.io.Serializable;



import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.itcast.jk.dao.ContractDao;
import cn.itcast.jk.domain.Contract;
import cn.itcast.jk.pagination.Page;


/**
 * @Description 购销合同数据访问层实现类
 * @author Administrator
 * @CreateDate 2017年12月25日
 */
@Repository
public class ContractDaoImpl extends BaseDaoImpl<Contract> implements ContractDao {

	public ContractDaoImpl() {
		//设置命名空间
		super.setNs("cn.itcast.jk.mapper.ContractMapper");
	}
	public void updateState(Map map) {
		super.getSqlSession().update(super.getNs()+".updateState",map);
	}

}
