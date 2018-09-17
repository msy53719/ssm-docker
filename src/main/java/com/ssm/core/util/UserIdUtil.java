package com.ssm.core.util;

public class UserIdUtil {

	public final static long BASE_USERID = 100000000L;

	public static long getUserId(long id) {
		long userid = id + 1;
		return userid;
	}

}
