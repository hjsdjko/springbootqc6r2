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


import com.dao.NiandulirunDao;
import com.entity.NiandulirunEntity;
import com.service.NiandulirunService;
import com.entity.vo.NiandulirunVO;
import com.entity.view.NiandulirunView;

@Service("niandulirunService")
public class NiandulirunServiceImpl extends ServiceImpl<NiandulirunDao, NiandulirunEntity> implements NiandulirunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NiandulirunEntity> page = this.selectPage(
                new Query<NiandulirunEntity>(params).getPage(),
                new EntityWrapper<NiandulirunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NiandulirunEntity> wrapper) {
		  Page<NiandulirunView> page =new Query<NiandulirunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NiandulirunVO> selectListVO(Wrapper<NiandulirunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NiandulirunVO selectVO(Wrapper<NiandulirunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NiandulirunView> selectListView(Wrapper<NiandulirunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NiandulirunView selectView(Wrapper<NiandulirunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<NiandulirunEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<NiandulirunEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<NiandulirunEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
