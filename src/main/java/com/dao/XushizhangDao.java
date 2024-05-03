package com.dao;

import com.entity.XushizhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XushizhangVO;
import com.entity.view.XushizhangView;


/**
 * 序时账
 * 
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
public interface XushizhangDao extends BaseMapper<XushizhangEntity> {
	
	List<XushizhangVO> selectListVO(@Param("ew") Wrapper<XushizhangEntity> wrapper);
	
	XushizhangVO selectVO(@Param("ew") Wrapper<XushizhangEntity> wrapper);
	
	List<XushizhangView> selectListView(@Param("ew") Wrapper<XushizhangEntity> wrapper);

	List<XushizhangView> selectListView(Pagination page,@Param("ew") Wrapper<XushizhangEntity> wrapper);
	
	XushizhangView selectView(@Param("ew") Wrapper<XushizhangEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XushizhangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XushizhangEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XushizhangEntity> wrapper);
}
