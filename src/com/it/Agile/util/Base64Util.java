package com.it.Agile.util;

import java.io.IOException;
import java.util.Base64;

public class Base64Util {
	/**
	 * 
	 * @param orign 需要编码的字符串
	 * @return 编码后的字符串
	 */
	public static String encode(String orign) {
		return new String(Base64.getEncoder().encode(orign.getBytes()));
		// return new String(new BASE64Encoder().encode(orign.getBytes()));
	}

	/**
	 * 
	 * @param orign 需要解码的字符串
	 * @return 解码后的字符串
	 */
	public static String decode(String orign) {
		String result = null;
		if (orign != null)
			result = new String(Base64.getDecoder().decode(orign.getBytes()));
		return result;
	}
}
