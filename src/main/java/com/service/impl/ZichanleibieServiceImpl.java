package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZichanleibieDao;
import com.entity.ZichanleibieEntity;
import com.service.ZichanleibieService;
import com.entity.vo.ZichanleibieVO;
import com.entity.view.ZichanleibieView;

@Service("zichanleibieService")
public class ZichanleibieServiceImpl extends ServiceImpl<ZichanleibieDao, ZichanleibieEntity> implements ZichanleibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZichanleibieEntity> page = this.selectPage(
                new Query<ZichanleibieEntity>(params).getPage(),
                new EntityWrapper<ZichanleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZichanleibieEntity> wrapper) {
		  Page<ZichanleibieView> page =new Query<ZichanleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZichanleibieVO> selectListVO(Wrapper<ZichanleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZichanleibieVO selectVO(Wrapper<ZichanleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZichanleibieView> selectListView(Wrapper<ZichanleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZichanleibieView selectView(Wrapper<ZichanleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
