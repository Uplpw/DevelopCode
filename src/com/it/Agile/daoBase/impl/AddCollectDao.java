/**
 * 
 */
package com.it.Agile.daoBase.impl;

import java.util.ArrayList;
import com.it.Agile.daoBase.*;
import com.it.Agile.bean.TB_Collect;

/**
 * @author lpw
 *
 */
public class AddCollectDao extends BaseDao<TB_Collect,Integer>{
	
	public AddCollectDao() {
		super(TB_Collect.class);
	}
	
	public ArrayList<TB_Collect> getMyCollectByUserName(String username){
		
		return (ArrayList<TB_Collect>) findBy("username", username, null, true);
	}
}
