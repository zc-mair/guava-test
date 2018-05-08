package com.zc.guava.day01;

import com.google.common.base.Objects;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ObjectsTest {
    @Before
    public void before(){

    }
    @Test
    public void ObjectsTest(){
        /**
         * 1.Objects.equals : 当一个对象中的字段可以为null时,我们需要不断进行null判断，Objects.equals避免了这点，使得代码很整洁。
         */

       boolean result = Objects.equal("1",null);
       assertFalse(result);
        /**
         * 2.Objects.hashCode:使用Objects.hashCode(field1, field2, …, fieldn)来代替手动计算散列值。  null字段已经被处理
         */
        int first =Objects.hashCode("id",null);
        int seconed = Objects.hashCode("id");
        assertNotEquals(first,seconed);
        /**
         * 3.Objects.toStringHelper:使用 Objects.toStringHelper可以轻松编写有用的toString方法  【已经废弃】
         */
        System.out.println(Objects.toStringHelper("Student").add("id",1)
                                                    .add("name","zc")
                                                    .add("age",24)); // return  Student{id=1, name=zc, age=24}
        

    }

    @After
    public void after(){

    }
}
class Student{
    private String id ;
    private String name;
    private int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id,name); //注意：即使id或者 name为null依然可以进行hash，我们不需要进行null判断了，内部处理了。
    }

    @Override
    public boolean equals(Object object) {

        if(!(object instanceof Student) || object == null){
            return false;
        }
        Student stu = (Student) object;
        /**
         * 1.旧写法
         */
//        return (this.id == stu.id && this.name ==stu.name && this.age == stu.age) ? true : false;
        /**
         * 2.新写法
         */
        return Objects.equal(this.id,stu.id) && Objects.equal(this.name,stu.name)  && Objects.equal(this.age,stu.age);
    }
}
