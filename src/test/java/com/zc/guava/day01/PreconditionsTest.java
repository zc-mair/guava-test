package com.zc.guava.day01;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
public class PreconditionsTest {
    @Before
    public void before(){

    }
    @Test
    public void PreconditionsTest(){
        /**
         * 1. checkArgument：检查给定条件
         */
         boolean  condition = (1==2);
         String   errorMsg= "1==2 is not true!";
//        Preconditions.checkArgument(condition);
//        Preconditions.checkArgument(condition,errorMsg);
//        Preconditions.checkArgument(condition,"这是个模板消息会拼接在 errorMsg之前",errorMsg);
        /**
         * 2.checkPositionIndex:检查位置值对某个列表、字符串或数组是否有效
         */
//        int [] arr = new int[]{1,2,3};
//        Preconditions.checkPositionIndex(10,arr.length);
//        Preconditions.checkPositionIndex(10,arr.length,"Illegal Argument passed: Invalid position");
        /**
         * 3.checkElementIndex:检查待索引值对某个列表、字符串或数组是否有效
         */
        int [] arr2 = new int[]{1,2,3};
//        Preconditions.checkElementIndex(2,arr2.length);
//        Preconditions.checkElementIndex(10,arr2.length,"Illegal Argument passed: Invalid index");
        /**
         * 4.checkState:用来检查对象的某些状态。
         */
         boolean flag = false;
//         Preconditions.checkState(flag);
//        Preconditions.checkState(flag,"变量: %s 为false","flag");
//        Preconditions.checkState(flag,"错误信息:","变量: flag 为false");
    }
    @After
    public void after(){

    }
}
