package cn.itcast.jk.service;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

import cn.itcast.jk.domain.Contract;
import cn.itcast.jk.pagination.Page;

/**
 * @Description 购销合同业务层实现接口
 * @author Administrator
 * @CreateDate 2017年12月25日
 */
public interface ContractService {
	public List<Contract> findPage(Page page);  //分页查询
	public List<Contract> find(Map paraMap); //带条件查询，条件可以为null，既没有条件；返回list对象集合
	public Contract get(Serializable id);//根据id查询
	public void insert(Contract contract);//插入
	public void update(Contract contract);//更新
	public void deleteById(Serializable id);//根据id删除
	public void delete(Serializable[] ids);//批量删除
	
	public void submit(Serializable[] ids);//提交
	public void cancel(Serializable[] ids);//取消
}
