package com.neu.limiao.singleton;

/**
 * 静态内部类单例模式
 * @author limiao
 * @time 2016年5月11日 下午10:32:05
 */
public class StaticInnerClassSingleton {
	private StaticInnerClassSingleton(){}
	public static StaticInnerClassSingleton getInstance(){
		return SingletonHolder.staticInnerClassSingleton;
	}
	/*
	 * 静态内部类
	 */
	private static class SingletonHolder{
		private static final StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
	}
}
