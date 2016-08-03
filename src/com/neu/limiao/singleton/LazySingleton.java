package com.neu.limiao.singleton;

/**
 * 单例模式-懒汉式
 * @author limiao
 * @time 2016年4月14日 上午9:58:24
 */
public class LazySingleton {
	private static LazySingleton singleton;
	private LazySingleton(){}
	public static synchronized LazySingleton getSingleton(){
		if(singleton == null){
			singleton = new LazySingleton();
		}
		return singleton;
	}
}
