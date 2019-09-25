package com.June28;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		User[] arrayUsers=new User[10];//定长
		List lUser=new ArrayList<User>();
		for(int i=0;i<10;i++){
			User user=new User();
			user.setName("test"+i);
			user.setSex("F");
			lUser.add(user);
		}
		User user1=new User();
		user1.setId(15);
		lUser.add(1, user1);
		lUser.remove(0);
		
		lUser.clear();
		
		System.out.println(lUser.size());
		for(int i=0;i<lUser.size();i++){
			int id=((User)lUser.get(i)).getId();
			String name=((User)lUser.get(i)).getName();
			System.out.println(id);
			System.out.println(name);
		}
		
		//遍历List的方法
		Iterator<User> it=lUser.iterator();//遍历List；<>表示泛型，要存这种类型的值
		while(it.hasNext()){
			System.out.println(it.next().getId());
		}
		
		List lUser2=new LinkedList<User>();
		lUser2.iterator();
		
		List lUser3=new Vector<User>();
		
		Set sUser=new HashSet<User>();
		for(int i=0;i<10;i++){
			User user=new User();
			user.setName("test"+i);
			user.setSex("F");
			sUser.add(user);
			sUser.add(user);//重复添加，会自动替换重复的
		}
		Iterator<User> it1=sUser.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next().getId());
		}
		
		/****************************/
		Properties pps=new Properties(); 
		
	}

}
