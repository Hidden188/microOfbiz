package com.June29;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.June28.User;

public class Test {

	public static void main(String[] args) {
		//List:ArrayList/LinkedList/Vector
		//Set:HashSet/TreeSet
		
		Set sUser=new TreeSet<String>();
		for(int i=1;i<10;i++){
			User user=new User();
			user.setId(i);
			user.setName("test"+i);
			user.setSex("F");
			sUser.add(sUser);
		}
		sUser.add(0);
		
	/****************************************/
		Iterator<User> it=sUser.iterator();
		while(it.hasNext()){
		System.out.println(it.next());
		}
	
	/***********************************************/
	 /* collecion
	 * List/Set
	 * Map
	 * 
	 */
}	
	
}
