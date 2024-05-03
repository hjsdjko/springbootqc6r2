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


import com.dao.XushizhangDao;
import com.entity.XushizhangEntity;
import com.service.XushizhangService;
import com.entity.vo.XushizhangVO;
import com.entity.view.XushizhangView;

@Service("xushizhangService")
public class XushizhangServiceImpl extends ServiceImpl<XushizhangDao, XushizhangEntity> implements XushizhangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XushizhangEntity> page = this.selectPage(
                new Query<XushizhangEntity>(params).getPage(),
                new EntityWrapper<XushizhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XushizhangEntity> wrapper) {
		  Page<XushizhangView> page =new Query<XushizhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XushizhangVO> selectListVO(Wrapper<XushizhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XushizhangVO selectVO(Wrapper<XushizhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XushizhangView> selectListView(Wrapper<XushizhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XushizhangView selectView(Wrapper<XushizhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<XushizhangEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<XushizhangEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<XushizhangEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
