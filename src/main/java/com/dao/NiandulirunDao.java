package com.dao;

import com.entity.NiandulirunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NiandulirunVO;
import com.entity.view.NiandulirunView;


/**
 * 年度利润
 * 
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
public interface NiandulirunDao extends BaseMapper<NiandulirunEntity> {
	
	List<NiandulirunVO> selectListVO(@Param("ew") Wrapper<NiandulirunEntity> wrapper);
	
	NiandulirunVO selectVO(@Param("ew") Wrapper<NiandulirunEntity> wrapper);
	
	List<NiandulirunView> selectListView(@Param("ew") Wrapper<NiandulirunEntity> wrapper);

	List<NiandulirunView> selectListView(Pagination page,@Param("ew") Wrapper<NiandulirunEntity> wrapper);
	
	NiandulirunView selectView(@Param("ew") Wrapper<NiandulirunEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<NiandulirunEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<NiandulirunEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<NiandulirunEntity> wrapper);
}
