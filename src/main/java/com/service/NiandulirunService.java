package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NiandulirunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NiandulirunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NiandulirunView;


/**
 * 年度利润
 *
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
public interface NiandulirunService extends IService<NiandulirunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NiandulirunVO> selectListVO(Wrapper<NiandulirunEntity> wrapper);
   	
   	NiandulirunVO selectVO(@Param("ew") Wrapper<NiandulirunEntity> wrapper);
   	
   	List<NiandulirunView> selectListView(Wrapper<NiandulirunEntity> wrapper);
   	
   	NiandulirunView selectView(@Param("ew") Wrapper<NiandulirunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NiandulirunEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<NiandulirunEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<NiandulirunEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<NiandulirunEntity> wrapper);
}

