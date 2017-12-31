package cn.itcast.jk.dao;

import java.io.Serializable;

import cn.itcast.jk.domain.ExtCproduct;

/**
 * @Description 货物附件数据访问层接口
 * @author Administrator
 * @CreateDate 2017年12月25日
 */
public interface ExtCproductDao extends BaseDao<ExtCproduct> {
	public void deleteByContractProductById(Serializable[] ids);
	public void deleteByContractId(Serializable[] contractIds);
}
