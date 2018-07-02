package com.xinlizz.base.secondDay_serialization;

/**
 * 测试demo类
 *
 * @Author xinlizz
 * @Date 2018/7/1
 */
public class DemoTest {
    public static void main(String[] args) throws CloneNotSupportedException {
//        IObjSerialize objSerialize = new ObjSerializeImpl();
//
//        User user = new User();
//        user.setId(100L);
//        user.setUserName("xinlizz");
//        user.setSex("保密");
//        user.setAge(25);
//        byte[] data = objSerialize.serialize(user);
//
//        User u = objSerialize.deSerialize(data, User.class);
//        System.out.println(u);
//
//        objSerialize.serializeToFile(user, "user");
//        User.num = 50;
//        User u2 = objSerialize.deSerializeByFile("user", User.class);
//        System.out.println(u2 + "--->" + User.num);

        //浅克隆
        Email email = new Email("年中调薪2000");
        Person p1 = new Person("张三",true,15,email);

        Person p2 = p1.clone();
        p2.setName("李四");
        p2.getEmail().setContent("年中调薪5000");
        System.out.println(p1);
        System.out.println(p2);

        //深克隆
//        Email email = new Email("年中调薪2000");
//        Person p1 = new Person("张三", email);
//
//        Person p2 = p1.deepClone();
//        p2.setName("李四");
//        p2.getEmail().setContent("年中调薪5000");
//        System.out.println(p1);
//        System.out.println(p2);
    }
}
