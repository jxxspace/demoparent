package com.example.common;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtil {
    /**
     * 从Map<String,Object>中获取字符串
     * @param map
     * @param key
     * @return
     */
    public static String  getSMap(Map<String,Object> map,String key){
        String str = "";
        if(map.containsKey(key)){
            Object o = map.get(key);
            if(o != null){
                str = String.valueOf(o);
            }
        }
        return str;
    }
    /**
     * 从Map<String,String>中获取字符串
     * @param map
     * @param key
     * @return
     */
    public static String  getS(Map<String,String> map,String key){
        String str = "";
        if(map.containsKey(key)){
            String str1 = map.get(key);
            if(StringUtils.isNotBlank(str1)){
                 str = str1;
            }
        }
        return "";
    }

    /**
     * 校验是否是手机号码
     * @param phone
     * @return
     */
    public static boolean isPhone(String phone) {
        String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
        if (phone.length() != 11) {
            return false;
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            boolean isMatch = m.matches();
            return isMatch;
        }
    }

    /**
     * 判断一个List是不是为空
     * @param
     */
    public static boolean isNullList(List list) {
        if(list == null || list.isEmpty() || list.size()==0){
            return true;
        }else{
            return false;
        }
    }
    public static void  main(String[] args){
        Map<String, String > map = new HashMap<>();
        System.out.println(isPhone("13261849410"));
    }
}
