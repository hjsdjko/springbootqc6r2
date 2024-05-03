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


import com.dao.GongzidiaozhengDao;
import com.entity.GongzidiaozhengEntity;
import com.service.GongzidiaozhengService;
import com.entity.vo.GongzidiaozhengVO;
import com.entity.view.GongzidiaozhengView;

@Service("gongzidiaozhengService")
public class GongzidiaozhengServiceImpl extends ServiceImpl<GongzidiaozhengDao, GongzidiaozhengEntity> implements GongzidiaozhengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongzidiaozhengEntity> page = this.selectPage(
                new Query<GongzidiaozhengEntity>(params).getPage(),
                new EntityWrapper<GongzidiaozhengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongzidiaozhengEntity> wrapper) {
		  Page<GongzidiaozhengView> page =new Query<GongzidiaozhengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongzidiaozhengVO> selectListVO(Wrapper<GongzidiaozhengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongzidiaozhengVO selectVO(Wrapper<GongzidiaozhengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongzidiaozhengView> selectListView(Wrapper<GongzidiaozhengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongzidiaozhengView selectView(Wrapper<GongzidiaozhengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
