package com.hzm.four;

import java.lang.reflect.Array;

/**
 * Package: com.hzm.four
 * Description： TODO
 * Author: houzm@pssyun.com
 * Date: Created in 2018/3/30 19:01
 * Company: 景眭
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 */
public class DemoFanXingTest {

//    public static T one;
//    public static T show(T t){
//        return t;
//    }

//    public static void main(String[] args) {
//
//    }

    public static <T> void show(T[] t){
//        T t = new T();
//        T[] ts = new T[2];
        T[] mm = (T[]) Array.newInstance(t.getClass().getComponentType(), 2);
    }
}
