package com.xuyao.service;

import com.xuyao.framework.ehcache.dao.EhCacheDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * Created by xuyao on 2017/4/16.
 */
public class BaseServiceImpl implements BaseService {

    @Autowired
    private EhCacheDao ehCacheDao;

    @Override
    public void printInfo() {
        System.out.println("xyservice printInfo! \n Hello World!");
    }

    @Override
    public String sayHello() {
        return "Xu Yao, Hello~";
    }

	@Override
	public String sayHello(int num) {
		
		return num + ", Hello Kitty";
	}

    @Override
    public void put(String s, Object o, int i, int i1) {
        ehCacheDao.put(s, o, i, i1);
    }

    @Override
    public <T> T get(String s) {
        return ehCacheDao.get(s);
    }

    @Override
    public boolean remove(String s) {
        return ehCacheDao.remove(s);
    }

    @Override
    public void removeAll(Collection<?> collection) {
        ehCacheDao.removeAll(collection);
    }

    @Override
    public void removeAll() {
        ehCacheDao.removeAll();
    }

}
