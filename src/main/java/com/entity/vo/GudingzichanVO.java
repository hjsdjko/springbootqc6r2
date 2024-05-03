package com.entity.vo;

import com.entity.GudingzichanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 固定资产
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
public class GudingzichanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 资产类别
	 */
	
	private String zichanleibie;
		
	/**
	 * 资产状态
	 */
	
	private String zichanzhuangtai;
		
	/**
	 * 资产价值
	 */
	
	private Integer zichanjiazhi;
		
	/**
	 * 风险计提
	 */
	
	private Integer fengxianjiti;
		
	/**
	 * 计提原因
	 */
	
	private String jitiyuanyin;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：资产类别
	 */
	 
	public void setZichanleibie(String zichanleibie) {
		this.zichanleibie = zichanleibie;
	}
	
	/**
	 * 获取：资产类别
	 */
	public String getZichanleibie() {
		return zichanleibie;
	}
				
	
	/**
	 * 设置：资产状态
	 */
	 
	public void setZichanzhuangtai(String zichanzhuangtai) {
		this.zichanzhuangtai = zichanzhuangtai;
	}
	
	/**
	 * 获取：资产状态
	 */
	public String getZichanzhuangtai() {
		return zichanzhuangtai;
	}
				
	
	/**
	 * 设置：资产价值
	 */
	 
	public void setZichanjiazhi(Integer zichanjiazhi) {
		this.zichanjiazhi = zichanjiazhi;
	}
	
	/**
	 * 获取：资产价值
	 */
	public Integer getZichanjiazhi() {
		return zichanjiazhi;
	}
				
	
	/**
	 * 设置：风险计提
	 */
	 
	public void setFengxianjiti(Integer fengxianjiti) {
		this.fengxianjiti = fengxianjiti;
	}
	
	/**
	 * 获取：风险计提
	 */
	public Integer getFengxianjiti() {
		return fengxianjiti;
	}
				
	
	/**
	 * 设置：计提原因
	 */
	 
	public void setJitiyuanyin(String jitiyuanyin) {
		this.jitiyuanyin = jitiyuanyin;
	}
	
	/**
	 * 获取：计提原因
	 */
	public String getJitiyuanyin() {
		return jitiyuanyin;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
			
}
