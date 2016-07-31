package com.ztesoft.iom.utils.helper.controller.threadController;

import java.util.HashMap;
import java.util.Map;


/**
 * 自定义线程变量
 * zhong.kaijie	  2016年1月20日
 */
public class UserThreadLocal {
	private static ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<Map<String, Object>>();

	protected UserThreadLocal() {
	}

	public static Object get(String attribute) {
		try {

			Map<String, Object> map = (Map<String, Object>) threadLocal.get();
			if (map == null) {
				map = new HashMap<String, Object>();
				threadLocal.set(map);
			}
			return map.get(attribute);
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e.getMessage(), e);
		}

	}

	@SuppressWarnings("unchecked")
	public static <T> T get(String attribute, Class<T> clazz) {
		return (T) get(attribute);
	}

	/**
	 * 保存于ThreadLocal中
	 * 
	 * @param attribute
	 * @param value
	 *            zhong.kaijie 上午10:34:18
	 */
	public static void set(String attribute, Object value) {
		Map<String, Object> map = (Map<String, Object>) threadLocal.get();

		if (map == null) {
			map = new HashMap<String, Object>();
			threadLocal.set(map);
		}
		map.put(attribute, value);
	}
	
	/**
	 * 清空threadlocal对象
	 */
	public static void clear(){
		threadLocal.remove();
	}
}
