package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 年度利润
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
@TableName("niandulirun")
public class NiandulirunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public NiandulirunEntity() {
		
	}
	
	public NiandulirunEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 年度统计
	 */
					
	private String niandutongji;
	
	/**
	 * 主营收入
	 */
					
	private Float zhuyingshouru;
	
	/**
	 * 主营业务成本
	 */
					
	private Integer zhuyingyewuchengben;
	
	/**
	 * 主营业务税金及附加
	 */
					
	private Integer zhuyingyewushuijinjifujia;
	
	/**
	 * 其他业务利润
	 */
					
	private Integer qitayewulirun;
	
	/**
	 * 营业费用
	 */
					
	private Integer yingyefeiyong;
	
	/**
	 * 管理费用
	 */
					
	private Integer guanlifeiyong;
	
	/**
	 * 财务费用
	 */
					
	private Integer caiwufeiyong;
	
	/**
	 * 投资收益
	 */
					
	private Integer touzishouyi;
	
	/**
	 * 补贴收益
	 */
					
	private Integer butieshouyi;
	
	/**
	 * 营业外收入
	 */
					
	private Integer yingyewaishouru;
	
	/**
	 * 营业外支出
	 */
					
	private Integer yingyewaizhichu;
	
	/**
	 * 所得税
	 */
					
	private Integer suodeshui;
	
	/**
	 * 净利润
	 */
					
	private Integer jinglirun;
	
	/**
	 * 登记时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：年度统计
	 */
	public void setNiandutongji(String niandutongji) {
		this.niandutongji = niandutongji;
	}
	/**
	 * 获取：年度统计
	 */
	public String getNiandutongji() {
		return niandutongji;
	}
	/**
	 * 设置：主营收入
	 */
	public void setZhuyingshouru(Float zhuyingshouru) {
		this.zhuyingshouru = zhuyingshouru;
	}
	/**
	 * 获取：主营收入
	 */
	public Float getZhuyingshouru() {
		return zhuyingshouru;
	}
	/**
	 * 设置：主营业务成本
	 */
	public void setZhuyingyewuchengben(Integer zhuyingyewuchengben) {
		this.zhuyingyewuchengben = zhuyingyewuchengben;
	}
	/**
	 * 获取：主营业务成本
	 */
	public Integer getZhuyingyewuchengben() {
		return zhuyingyewuchengben;
	}
	/**
	 * 设置：主营业务税金及附加
	 */
	public void setZhuyingyewushuijinjifujia(Integer zhuyingyewushuijinjifujia) {
		this.zhuyingyewushuijinjifujia = zhuyingyewushuijinjifujia;
	}
	/**
	 * 获取：主营业务税金及附加
	 */
	public Integer getZhuyingyewushuijinjifujia() {
		return zhuyingyewushuijinjifujia;
	}
	/**
	 * 设置：其他业务利润
	 */
	public void setQitayewulirun(Integer qitayewulirun) {
		this.qitayewulirun = qitayewulirun;
	}
	/**
	 * 获取：其他业务利润
	 */
	public Integer getQitayewulirun() {
		return qitayewulirun;
	}
	/**
	 * 设置：营业费用
	 */
	public void setYingyefeiyong(Integer yingyefeiyong) {
		this.yingyefeiyong = yingyefeiyong;
	}
	/**
	 * 获取：营业费用
	 */
	public Integer getYingyefeiyong() {
		return yingyefeiyong;
	}
	/**
	 * 设置：管理费用
	 */
	public void setGuanlifeiyong(Integer guanlifeiyong) {
		this.guanlifeiyong = guanlifeiyong;
	}
	/**
	 * 获取：管理费用
	 */
	public Integer getGuanlifeiyong() {
		return guanlifeiyong;
	}
	/**
	 * 设置：财务费用
	 */
	public void setCaiwufeiyong(Integer caiwufeiyong) {
		this.caiwufeiyong = caiwufeiyong;
	}
	/**
	 * 获取：财务费用
	 */
	public Integer getCaiwufeiyong() {
		return caiwufeiyong;
	}
	/**
	 * 设置：投资收益
	 */
	public void setTouzishouyi(Integer touzishouyi) {
		this.touzishouyi = touzishouyi;
	}
	/**
	 * 获取：投资收益
	 */
	public Integer getTouzishouyi() {
		return touzishouyi;
	}
	/**
	 * 设置：补贴收益
	 */
	public void setButieshouyi(Integer butieshouyi) {
		this.butieshouyi = butieshouyi;
	}
	/**
	 * 获取：补贴收益
	 */
	public Integer getButieshouyi() {
		return butieshouyi;
	}
	/**
	 * 设置：营业外收入
	 */
	public void setYingyewaishouru(Integer yingyewaishouru) {
		this.yingyewaishouru = yingyewaishouru;
	}
	/**
	 * 获取：营业外收入
	 */
	public Integer getYingyewaishouru() {
		return yingyewaishouru;
	}
	/**
	 * 设置：营业外支出
	 */
	public void setYingyewaizhichu(Integer yingyewaizhichu) {
		this.yingyewaizhichu = yingyewaizhichu;
	}
	/**
	 * 获取：营业外支出
	 */
	public Integer getYingyewaizhichu() {
		return yingyewaizhichu;
	}
	/**
	 * 设置：所得税
	 */
	public void setSuodeshui(Integer suodeshui) {
		this.suodeshui = suodeshui;
	}
	/**
	 * 获取：所得税
	 */
	public Integer getSuodeshui() {
		return suodeshui;
	}
	/**
	 * 设置：净利润
	 */
	public void setJinglirun(Integer jinglirun) {
		this.jinglirun = jinglirun;
	}
	/**
	 * 获取：净利润
	 */
	public Integer getJinglirun() {
		return jinglirun;
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
