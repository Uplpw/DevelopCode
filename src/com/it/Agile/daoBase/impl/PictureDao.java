/**
 * 
 */
package com.it.Agile.daoBase.impl;

import com.it.Agile.daoBase.*;
import com.it.Agile.bean.TB_Picture;

/**
 * @author lpw
 *
 */
public class PictureDao extends BaseDao<TB_Picture, Integer>{
	public PictureDao() {
		//必须显性初始化
		super(TB_Picture.class);
	}
}
