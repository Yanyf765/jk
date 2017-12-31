package cn.itcast.jk.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.itcast.jk.domain.ContractProduct;
import cn.itcast.jk.pagination.Page;

/**
 * @Description 合同货物业务层实现接口
 * @author Administrator
 * @CreateDate 2017年12月25日
 */
public interface ContractProductService {
	public List<ContractProduct> findPage(Page page);
	public List<ContractProduct> find(Map paraMap);
	public ContractProduct get(Serializable id);
	public void insert(ContractProduct contractProduct);
	public void update(ContractProduct contractProduct);
	
	public void deleteById(Serializable id);
	public void delete(Serializable[] ids);
}
