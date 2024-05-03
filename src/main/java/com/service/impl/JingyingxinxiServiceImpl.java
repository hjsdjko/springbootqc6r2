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


import com.dao.JingyingxinxiDao;
import com.entity.JingyingxinxiEntity;
import com.service.JingyingxinxiService;
import com.entity.vo.JingyingxinxiVO;
import com.entity.view.JingyingxinxiView;

@Service("jingyingxinxiService")
public class JingyingxinxiServiceImpl extends ServiceImpl<JingyingxinxiDao, JingyingxinxiEntity> implements JingyingxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingyingxinxiEntity> page = this.selectPage(
                new Query<JingyingxinxiEntity>(params).getPage(),
                new EntityWrapper<JingyingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingyingxinxiEntity> wrapper) {
		  Page<JingyingxinxiView> page =new Query<JingyingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingyingxinxiVO> selectListVO(Wrapper<JingyingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingyingxinxiVO selectVO(Wrapper<JingyingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingyingxinxiView> selectListView(Wrapper<JingyingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingyingxinxiView selectView(Wrapper<JingyingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<JingyingxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<JingyingxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<JingyingxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
