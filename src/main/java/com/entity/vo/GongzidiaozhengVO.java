package com.entity.vo;

import com.entity.GongzidiaozhengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 工资调整
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
public class GongzidiaozhengVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 调整额度
	 */
	
	private Integer diaozhengedu;
		
	/**
	 * 调整时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date diaozhengshijian;
		
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
				
	
	/**
	 * 设置：调整额度
	 */
	 
	public void setDiaozhengedu(Integer diaozhengedu) {
		this.diaozhengedu = diaozhengedu;
	}
	
	/**
	 * 获取：调整额度
	 */
	public Integer getDiaozhengedu() {
		return diaozhengedu;
	}
				
	
	/**
	 * 设置：调整时间
	 */
	 
	public void setDiaozhengshijian(Date diaozhengshijian) {
		this.diaozhengshijian = diaozhengshijian;
	}
	
	/**
	 * 获取：调整时间
	 */
	public Date getDiaozhengshijian() {
		return diaozhengshijian;
	}
				
	
	/**
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
			
}
