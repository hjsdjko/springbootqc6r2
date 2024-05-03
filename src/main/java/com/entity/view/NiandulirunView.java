package com.entity.view;

import com.entity.NiandulirunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 年度利润
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
@TableName("niandulirun")
public class NiandulirunView  extends NiandulirunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NiandulirunView(){
	}
 
 	public NiandulirunView(NiandulirunEntity niandulirunEntity){
 	try {
			BeanUtils.copyProperties(this, niandulirunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
