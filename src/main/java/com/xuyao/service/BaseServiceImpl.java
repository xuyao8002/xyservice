package com.xuyao.service;

/**
 * Created by xuyao on 2017/4/16.
 */
public class BaseServiceImpl implements BaseService {

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
    
}
