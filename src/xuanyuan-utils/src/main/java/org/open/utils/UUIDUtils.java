package org.open.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class UUIDUtils {
	
	
	/***
	 * 生成32位随机编号
	 * 生成理论上的集群唯一主键
	 * @return
	 */
	public static String uuid() throws UnknownHostException {
//		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
//		return uuid.toString();
		StringBuffer id = new StringBuffer();
		InetAddress addr = InetAddress.getLocalHost();
		String ip=addr.getHostAddress().toString().replace(".","");//本机IP
		long dateToTimestamp = DateTimeUtils.dateToTimestamp(new Date());//时间戳
		String number = RandomUtils.generateNumber(6);//6位长度纯数字字符串
		id.append(ip).append(dateToTimestamp).append(number);
		return id.toString();
	}



}
