package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingyingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingyingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingyingxinxiView;


/**
 * 经营信息
 *
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
public interface JingyingxinxiService extends IService<JingyingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingyingxinxiVO> selectListVO(Wrapper<JingyingxinxiEntity> wrapper);
   	
   	JingyingxinxiVO selectVO(@Param("ew") Wrapper<JingyingxinxiEntity> wrapper);
   	
   	List<JingyingxinxiView> selectListView(Wrapper<JingyingxinxiEntity> wrapper);
   	
   	JingyingxinxiView selectView(@Param("ew") Wrapper<JingyingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingyingxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JingyingxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JingyingxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JingyingxinxiEntity> wrapper);
}

