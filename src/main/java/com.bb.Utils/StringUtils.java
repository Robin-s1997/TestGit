package com.bb.Utils;

public class StringUtils {
    public static boolean isEmpty(String str){

            return str == null || "".equals(str);

    }

    public static boolean isNotEmpty(String str){

        return !isEmpty(str);

    }

}
