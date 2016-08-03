package com.neu.limiao.singleton;

/**
 * 单例模式-饿汉式
 * @author limiao
 * @time 2016年4月14日 上午9:53:23
 */
public class HungrySingleton {
	private static HungrySingleton singleton = new HungrySingleton();
	private HungrySingleton(){}
	public static HungrySingleton getSingleton(){
		return singleton;
	}
}
