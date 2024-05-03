package com.dao;

import com.entity.JingyingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingyingxinxiVO;
import com.entity.view.JingyingxinxiView;


/**
 * 经营信息
 * 
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
public interface JingyingxinxiDao extends BaseMapper<JingyingxinxiEntity> {
	
	List<JingyingxinxiVO> selectListVO(@Param("ew") Wrapper<JingyingxinxiEntity> wrapper);
	
	JingyingxinxiVO selectVO(@Param("ew") Wrapper<JingyingxinxiEntity> wrapper);
	
	List<JingyingxinxiView> selectListView(@Param("ew") Wrapper<JingyingxinxiEntity> wrapper);

	List<JingyingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JingyingxinxiEntity> wrapper);
	
	JingyingxinxiView selectView(@Param("ew") Wrapper<JingyingxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JingyingxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JingyingxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JingyingxinxiEntity> wrapper);
}
