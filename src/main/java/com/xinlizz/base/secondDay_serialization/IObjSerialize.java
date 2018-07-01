package com.xinlizz.base.secondDay_serialization;

/**
 * 测试序列化接口
 * @Author xinlizz
 * @Date 2018/7/1
 */
public interface IObjSerialize {

    /**
     * 以流的方式序列化obj对象
     * @author xinlizz
     * @Date 2018/7/1
     * @Param [obj] 
     * @return byte[]
     */
    <T> byte[] serialize(T obj);

    /**
     * 以流的方式反序列化
     * @author xinlizz
     * @Date 2018/7/1
     * @Param [data, clazz] 
     * @return T
     */
    <T> T deSerialize(byte[] data, Class<T> clazz);

    /**
     * 序列化到文件中
     * @author xinlizz
     * @Date 2018/7/1
     * @Param [fileName]
     * @return void
     */
    <T> void serializeToFile(T obj, String fileUrl);

    /**
     * 从文件中将数据反序列化
     * @author xinlizz
     * @Date 2018/7/1
     * @Param [fileUrl, clazz]
     * @return T
     */
    <T> T deSerializeByFile(String fileUrl, Class<T> clazz);
}
