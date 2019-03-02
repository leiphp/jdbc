package cn.lxtkj.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.lxtkj.action.GoddessAction;
import cn.lxtkj.model.Goddess;

public class TestAction {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		GoddessAction action = new GoddessAction();
		/***
		 *查询
		 */
//		List<Goddess> result = action.query();
//		for (int i = 0; i < result.size(); i++) {
//			System.out.println(result.get(i).getId()+
//					":"+result.get(i).getUser_name());
//		}
		
		/**
		 * 根据条件查询
		 */
		List<Map<String, Object>> params=new ArrayList<Map<String, Object>>();
		
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("name", "user_name");
		map.put("rela", "=");
		map.put("value", "'小美'");
		params.add(map);
		
		List<Goddess> result = action.query(params);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).getId()+
					":"+result.get(i).getUser_name());
		}
		
		/**
		 * 新增
		 */
//		Goddess g=new Goddess();
//		g.setUser_name("小青");
//		g.setSex(1);
//		g.setAge(25);
//		g.setBirthday(new Date());
//		g.setEmail("xiaoqing@163.com");
//		g.setMobile("15688888888");
//		g.setIsdel(0);
//		
//		action.add(g);
		
		/**
		 * 编辑
		 */
//		Goddess g=new Goddess();
//		g.setUser_name("小青");
//		g.setSex(1);
//		g.setAge(25);
//		g.setBirthday(new Date());
//		g.setEmail("xiaoqing@163.com");
//		g.setMobile("15688888888");
//		g.setIsdel(0);
//		g.setId(6);
//		
//		action.edit(g);
		
		/**
		 * 删除
		 */
//		Goddess g=new Goddess();
//		g.setUser_name("小青");
//		g.setSex(1);
//		g.setAge(25);
//		g.setBirthday(new Date());
//		g.setEmail("xiaoqing@163.com");
//		g.setMobile("15688888888");
//		g.setIsdel(0);
//		g.setId(3);
//		
//		action.del(3);
		
	}

}
