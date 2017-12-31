package cn.itcast.jk.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.itcast.jk.domain.ContractProduct;
import cn.itcast.jk.domain.ExtCproduct;
import cn.itcast.jk.pagination.Page;

/**
 * @Description 货物附件业务层实现接口
 * @author Administrator
 * @CreateDate 2017年12月25日
 */
public interface ExtCproductService {
	public List<ExtCproduct> findPage(Page page);
	public List<ExtCproduct> find(Map paraMap);
	public ExtCproduct get(Serializable id);
	public void insert(ExtCproduct extCproduct);
	public void update(ExtCproduct extCproduct);
	public void deleteById(Serializable id);
	public void delete(Serializable[] ids);
	
	
}
