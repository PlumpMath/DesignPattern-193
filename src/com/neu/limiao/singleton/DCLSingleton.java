package com.neu.limiao.singleton;

/**
 * Double Check Lock
 * 优点是既能够在需要时才初始化单例，又能保证线程安全，且单例对象初始化后调用getInstance不进行同步锁
 * @author limiao
 * @time 2016年5月11日 下午5:08:13
 */
public class DCLSingleton {
	// 保证dclSingleton实例每次都是从主内存中取
	private volatile static DCLSingleton dclSingleton = null;
	private DCLSingleton(){}
	public static DCLSingleton getInstance(){
		if(dclSingleton == null){
			synchronized(DCLSingleton.class){
				if(dclSingleton == null){
					dclSingleton = new DCLSingleton();
				}
			}
		}
		return dclSingleton;
	} 
}
