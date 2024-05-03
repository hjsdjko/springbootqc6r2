package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanleibieView;


/**
 * 资产类别
 *
 * @author 
 * @email 
 * @date 2022-04-02 16:46:23
 */
public interface ZichanleibieService extends IService<ZichanleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanleibieVO> selectListVO(Wrapper<ZichanleibieEntity> wrapper);
   	
   	ZichanleibieVO selectVO(@Param("ew") Wrapper<ZichanleibieEntity> wrapper);
   	
   	List<ZichanleibieView> selectListView(Wrapper<ZichanleibieEntity> wrapper);
   	
   	ZichanleibieView selectView(@Param("ew") Wrapper<ZichanleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanleibieEntity> wrapper);
   	

}

