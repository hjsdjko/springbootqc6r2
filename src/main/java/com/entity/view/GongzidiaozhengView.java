package com.entity.view;

import com.entity.GongzidiaozhengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 工资调整
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
@TableName("gongzidiaozheng")
public class GongzidiaozhengView  extends GongzidiaozhengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongzidiaozhengView(){
	}
 
 	public GongzidiaozhengView(GongzidiaozhengEntity gongzidiaozhengEntity){
 	try {
			BeanUtils.copyProperties(this, gongzidiaozhengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
