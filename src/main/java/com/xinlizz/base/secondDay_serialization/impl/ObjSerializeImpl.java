package com.xinlizz.base.secondDay_serialization.impl;

import com.xinlizz.base.secondDay_serialization.IObjSerialize;

import java.io.*;

/**
 * 测试序列化实现类
 */
public class ObjSerializeImpl implements IObjSerialize {
    @Override
    public <T> byte[] serialize(T obj) {
        ByteArrayOutputStream bout = null;
        ObjectOutputStream oop = null;
        try {
            bout = new ByteArrayOutputStream();
            oop = new ObjectOutputStream(bout);
            oop.writeObject(obj);
            return bout.toByteArray();
        } catch (Exception e) {

        } finally {
            if (null != bout) {
                try {
                    bout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != oop) {
                try {
                    oop.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public <T> T deSerialize(byte[] data, Class<T> clazz) {
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream bis = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(data);
            bis = new ObjectInputStream(byteArrayInputStream);
            return (T) bis.readObject();
        } catch (Exception e) {

        } finally {
            if (null != byteArrayInputStream) {
                try {
                    byteArrayInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != bis) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public <T> void serializeToFile(T obj, String fileUrl) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(new File(fileUrl)));
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != oos) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public <T> T deSerializeByFile(String fileUrl, Class<T> clazz) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(new File(fileUrl)));
            return (T) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (null != ois ) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
