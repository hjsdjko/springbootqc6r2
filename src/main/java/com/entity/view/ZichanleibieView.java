package com.entity.view;

import com.entity.ZichanleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资产类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
@TableName("zichanleibie")
public class ZichanleibieView  extends ZichanleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZichanleibieView(){
	}
 
 	public ZichanleibieView(ZichanleibieEntity zichanleibieEntity){
 	try {
			BeanUtils.copyProperties(this, zichanleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
