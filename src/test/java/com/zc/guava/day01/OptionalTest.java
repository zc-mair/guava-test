package com.zc.guava.day01;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class OptionalTest {
    @Before
    public void before(){

    }
    @Test
    public void optional(){
        /**
         * 测试一： Optional 内部参数判断采用 Preconditions
         */
//        Optional<Integer> a =Optional.of(null);// 返回包含给定的非空引用Optional实例
//        Optional<Integer> b = Optional.of(10);
//        assertEquals(10, a.get()+b.get());
        /**
         * 测试二：使用Preconditions 进行参数判断
         */
//        Integer c  =null;
//        Integer d =10;
//        Preconditions.checkNotNull(c);
//        Preconditions.checkArgument(c!=null,"c is null !");
//        Preconditions.checkNotNull(d);
//        assertEquals(10, c+d);
        /**
         * 测试三：fromNullable
         */
//        Optional<List<String>> optional1= Optional.fromNullable(Lists.asList("a","b",new String[]{"c","d"}));//如果nullableReference非空，返回一个包含引用Optional实例;否则返回absent()
//        assertEquals(4,optional1.get().size());
//        Optional<List<String>> optional2= Optional.fromNullable(Lists.asList("a","b",null));//Lists.asLists底层使用Preconditions 进行not null判断,因此list无法构建
//        assertEquals(2,optional2.get().size());
        /**
         * 测试四：transform
         */
//        Optional<List<String>> optional3= Optional.fromNullable(Lists.asList("a","b",new String[]{"c","d"}));
//        Optional<String> result3 = optional3.transform(  list -> list.get(0) +"a");
//        assertEquals("aa",result3.get());
        /**
         * 测试五 or
         */
        Optional<String> optional4= Optional.fromNullable("./datasource.conf");
        assertEquals("./datasource.conf",optional4.or("./hbase-site.xml"));//如果optional4存在实例; 否则返回"./hbase-site.xml"。
        assertEquals("./hbase-site.xml",Optional.absent().or("./hbase-site.xml"));//Optional.absent() 会创建一个没有包含任何实例的对象
    }
    @After
    public void after(){

    }
}
