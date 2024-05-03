package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongzidiaozhengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongzidiaozhengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzidiaozhengView;


/**
 * 工资调整
 *
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
public interface GongzidiaozhengService extends IService<GongzidiaozhengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongzidiaozhengVO> selectListVO(Wrapper<GongzidiaozhengEntity> wrapper);
   	
   	GongzidiaozhengVO selectVO(@Param("ew") Wrapper<GongzidiaozhengEntity> wrapper);
   	
   	List<GongzidiaozhengView> selectListView(Wrapper<GongzidiaozhengEntity> wrapper);
   	
   	GongzidiaozhengView selectView(@Param("ew") Wrapper<GongzidiaozhengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongzidiaozhengEntity> wrapper);
   	

}

