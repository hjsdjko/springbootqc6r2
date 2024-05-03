package com.dao;

import com.entity.ZichanleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZichanleibieVO;
import com.entity.view.ZichanleibieView;


/**
 * 资产类别
 * 
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
public interface ZichanleibieDao extends BaseMapper<ZichanleibieEntity> {
	
	List<ZichanleibieVO> selectListVO(@Param("ew") Wrapper<ZichanleibieEntity> wrapper);
	
	ZichanleibieVO selectVO(@Param("ew") Wrapper<ZichanleibieEntity> wrapper);
	
	List<ZichanleibieView> selectListView(@Param("ew") Wrapper<ZichanleibieEntity> wrapper);

	List<ZichanleibieView> selectListView(Pagination page,@Param("ew") Wrapper<ZichanleibieEntity> wrapper);
	
	ZichanleibieView selectView(@Param("ew") Wrapper<ZichanleibieEntity> wrapper);
	

}
