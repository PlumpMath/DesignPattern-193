package com.neu.limiao.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例的统一管理类
 * @author limiao
 * @time 2016年5月12日 上午10:26:22
 */
public class SingletonManager {
	private static Map<String,Object> objMap = new HashMap<>();
	private SingletonManager(){}
	public static void registerService(String key,Object instance){
		if(!objMap.containsKey(key)){
			objMap.put(key, instance);
		}
	}
	public static Object getService(String key){
		return objMap.get(key);
	}
}
