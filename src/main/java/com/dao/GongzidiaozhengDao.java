package com.dao;

import com.entity.GongzidiaozhengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongzidiaozhengVO;
import com.entity.view.GongzidiaozhengView;


/**
 * 工资调整
 * 
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
public interface GongzidiaozhengDao extends BaseMapper<GongzidiaozhengEntity> {
	
	List<GongzidiaozhengVO> selectListVO(@Param("ew") Wrapper<GongzidiaozhengEntity> wrapper);
	
	GongzidiaozhengVO selectVO(@Param("ew") Wrapper<GongzidiaozhengEntity> wrapper);
	
	List<GongzidiaozhengView> selectListView(@Param("ew") Wrapper<GongzidiaozhengEntity> wrapper);

	List<GongzidiaozhengView> selectListView(Pagination page,@Param("ew") Wrapper<GongzidiaozhengEntity> wrapper);
	
	GongzidiaozhengView selectView(@Param("ew") Wrapper<GongzidiaozhengEntity> wrapper);
	

}
