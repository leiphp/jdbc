package cn.lxtkj.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.lxtkj.dao.GoddessDao;
import cn.lxtkj.model.Goddess;

public class GoddessAction {
	
	public void add(Goddess goddess) throws Exception {
		goddess.setSex(1);

		goddess.setCreate_user("ADMIN");

		goddess.setUpdate_user("ADMIN");

		goddess.setIsdel(0);
		GoddessDao dao=new GoddessDao();
		dao.addGoddess(goddess);
		
		
	}
	public Goddess get(Integer id) throws SQLException {
		GoddessDao dao=new GoddessDao();
		return dao.get(id);
		
	}
	public void edit(Goddess goddess) throws Exception {
		GoddessDao dao=new GoddessDao();
		dao.updateGoddess(goddess);
	}
	public void del(Integer id) throws SQLException {
		GoddessDao dao=new GoddessDao();
		dao.delGoddess(id);
	}
	public List<Goddess> query() throws Exception {
		GoddessDao dao=new GoddessDao();
		return dao.query();
	}
	public List<Goddess> query(List<Map<String, Object>> params) throws Exception {
		GoddessDao dao=new GoddessDao();
		return dao.query(params);
	}
	
//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//		GoddessDao g=new GoddessDao();
//		
////		List<Goddess> result=g.query("小美","13798262415","xiao");
//		List<Map<String ,Object>> params=new ArrayList<Map<String ,Object>>();
//		Map<String ,Object> param=new HashMap<String, Object>();
//		param.put("name", "user_name");
//		param.put("rela", "like");
//		param.put("value", "'%小美%'");
//		params.add(param);
//		param=new HashMap<String, Object>();
//		param.put("name", "mobile");
//		param.put("rela", "=");
//		param.put("value", "'13798262415'");
//		params.add(param);
//		
//		List<Goddess> result=g.query(params);
//		for (int i = 0; i < result.size(); i++) {
//			System.out.println(result.get(i).toString());
//		}
//		Goddess g1=new Goddess();
//		
//		g1.setUser_name("小夏");
//		g1.setAge(21);
//		g1.setSex(1);
//		g1.setBirthday(new Date());
//		g1.setEmail("xiaoxia@imooc.com");
//		g1.setMobile("13798262504");
//		g1.setUpdate_user("admin1");
////		g1.setCreate_user("admin");
////		g1.setUpdate_user("admin");
//		g1.setIsdel(1);
////		g1.setId(5);
//		
////		Goddess g2 = g.get(5);
////		System.out.println(g2.toString());
//		
////		g.delGoddess(4);
//		
////		g.updateGoddess(g1);
//		
////		g.addGoddess(g1);
//		
////		g.query();
////		List<Goddess> gs=g.query();
////		
////		for(Goddess goddess : gs) {
////			System.out.println(goddess.getUser_name()+","+goddess.getAge());
////		}
//	}

}
