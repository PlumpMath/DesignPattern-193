package com.neu.limiao.singleton;

/**
 * 枚举单例
 * @author limiao
 * @time 2016年5月11日 下午10:47:22
 */
public enum EnumSingleton {
	INSTANCE;
	public void doSomething(){
		System.out.println("enum");
	}
	
	public static void main(String args[]){
		EnumSingleton.INSTANCE.doSomething();
	}
}
