/**
 * 
 */
package com.it.Agile.daoBase.impl;
import java.util.ArrayList;

import com.it.Agile.bean.*;
import com.it.Agile.daoBase.impl.*;
/**
 * @author lpw
 *
 */
public class test {
	public static void main(String[] args) {
		ArrayList<TB_Dish> list=(ArrayList<TB_Dish>)new DishPictureDao().getAll();
		//for(int )
		System.out.println(list);
	}
}
