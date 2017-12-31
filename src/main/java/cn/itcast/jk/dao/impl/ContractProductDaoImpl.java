package cn.itcast.jk.dao.impl;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.itcast.jk.dao.ContractProductDao;
import cn.itcast.jk.domain.ContractProduct;
import cn.itcast.jk.pagination.Page;

/**
 * @Description 合同货物数据访问层实现类
 * @author Administrator
 * @CreateDate 2017年12月25日
 */
@Repository
public class ContractProductDaoImpl extends BaseDaoImpl<ContractProduct> implements ContractProductDao {

	public ContractProductDaoImpl() {
		//设置命名空间
		super.setNs("cn.itcast.jk.mapper.ContractProductMapper");
	}

}
