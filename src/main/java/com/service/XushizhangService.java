package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XushizhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XushizhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XushizhangView;


/**
 * 序时账
 *
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
public interface XushizhangService extends IService<XushizhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XushizhangVO> selectListVO(Wrapper<XushizhangEntity> wrapper);
   	
   	XushizhangVO selectVO(@Param("ew") Wrapper<XushizhangEntity> wrapper);
   	
   	List<XushizhangView> selectListView(Wrapper<XushizhangEntity> wrapper);
   	
   	XushizhangView selectView(@Param("ew") Wrapper<XushizhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XushizhangEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XushizhangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XushizhangEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XushizhangEntity> wrapper);
}

