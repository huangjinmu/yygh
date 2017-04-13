package com.jim.yygh.dao;

import com.jim.yygh.entity.po.YhGncdSwjg;

import java.util.List;


/**
 * 屏蔽开放功能菜单
 * @author jim
 *
 */

public interface YhGncdSwjgDao {

	//查询所有停用标志为N的记录
	public List<YhGncdSwjg> getGncdControl();
	
	//根据税务机关代码查询停用标志为N的记录
	public List<YhGncdSwjg> getGncdControlBySwjgdm(String swjgdm);
	
	//根据多条件查询
	public List<YhGncdSwjg> getGncdControlByYhGncdSwjg(YhGncdSwjg yhGncdSwjg) ;
	
	//添加屏蔽菜单记录
	public int addYhGncdSwjg(YhGncdSwjg yhGncdSwjg);
	
	//根据主键修改屏蔽菜单记录
	public int updateYhGncdSwjg(YhGncdSwjg yhGncdSwjg);
	
	//根据主键删除屏蔽菜单记录
	public int deleteYhGncdSwjgById(String controlId);
	
}
