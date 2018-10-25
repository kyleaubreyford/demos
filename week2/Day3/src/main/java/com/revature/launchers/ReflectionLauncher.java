package com.revature.launchers;

import java.lang.reflect.Field;

import com.revature.beans.ReflectionBean;

public class ReflectionLauncher {  
	public static void main(String[] args)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		ReflectionBean bean = new ReflectionBean();
		System.out.println(bean.getProperty());
//		For(Field f: bean.getClass().fi
		Field f = bean.getClass().getDeclaredField("property");
		f.setAccessible(true);
		f.set(bean, "What???");

		System.out.println(bean.getProperty());
	}
}
