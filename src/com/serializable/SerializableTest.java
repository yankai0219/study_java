package com.serializable;

import java.io.Serializable;
import java.util.Random;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Data implements Serializable {
    private static final long serialVersionUID = 72424242424L;
    public int n;
    
    public Data(int n) {
    	this.n = n;
    }
    
    public String toString() {
    	return Integer.toString(n);
    }
}

class Worm implements Serializable {
    private static final long serialVersionUID = 54243424242432L;
    private Data[] d = {
    		new Data(random.nextInt(10)),
    		new Data(random.nextInt(10)),
    		new Data(random.nextInt(10))
    };
    private static Random random = new Random(47);
    private Worm next;
    private char c;

    public Worm(int i , char x) {
        System.out.println("Worm constructor:" +i);
        c = x;
        if(--i > 0) {
            next = new Worm(i , (char)(x+1));
        }
    }
    public Worm() {
        System.out.println("Default constructor!");
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder(":");
        sb.append(c);
        sb.append("(");
        for(Data data : d) {
            sb.append(data);
        }
        sb.append(")");
        if(next!=null) {
            sb.append(next);
        }
        return sb.toString();
    }
}


public class SerializableTest {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Worm w = new Worm(6 ,'a');
        System.out.println("���л�����֮ǰ");
        System.out.println("w="+w);
        
        //���л�����1--FileOutputStream
        ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("D:\\worm.out"));
        oos1.writeObject("Worm storage By FileOutputStream ");
        oos1.writeObject(w);//�����������õĶ���ʵ�����л��������վ���Data����ࣩ�������׳���java.io.NotSerializableException:����쳣
        oos1.close();
        
        //�����л�����1---FileInputStream
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("D:\\worm.out"));
        String s1 = (String)ois1.readObject();
        Worm w1 = (Worm)ois1.readObject();
        ois1.close();
        System.out.println("�����л�����1֮��");
        System.out.println(s1);
        System.out.println("w1:"+w1);
        
        //���л�����2--ByteArrayOutputStream
        ByteArrayOutputStream byteOutStream = new ByteArrayOutputStream();
        ObjectOutputStream oos2 = new ObjectOutputStream(byteOutStream);
        oos2.writeObject("Worm storage By ByteOutputStream ");
        oos2.writeObject(w);
        oos2.flush();
        
        //�����в���2--ByteArrayInputStream
        ByteArrayInputStream byteInStream = new ByteArrayInputStream(byteOutStream.toByteArray());
        ObjectInputStream ois2 = new ObjectInputStream(byteInStream);
        String s2 = (String)ois2.readObject();
        Worm w2 = (Worm)ois2.readObject();
        ois2.close();
        System.out.println("�����л�����2֮��");
        System.out.println(s2);
        System.out.println("w2:"+w2);
    }
    
    
}
