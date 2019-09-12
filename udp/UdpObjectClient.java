package cn.com.inet;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Date;

public class UdpObjectClient {
    //引用类型 发送端
    public static void main(String[] args) throws IOException {
        System.out.println("发送端启动中。。。");
//        DatagramSocket client = new DatagramSocket();
//        //序列化 写出
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(baos));
//        oos.writeUTF("小明");
//        oos.writeInt(16);
//        oos.writeBoolean(false);
//        oos.writeChar('a');
//        //对象
//        oos.writeObject("开启好生活");
//        oos.writeObject(new Date());
//        Employee emp = new Employee("小红",5000);
//        oos.writeObject(emp);
//        oos.flush();
//        byte[] datas = baos.toByteArray();
//
//        DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",6666));
//        client.send(packet);
//        client.close();
        DatagramSocket client = new DatagramSocket(8888);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(baos));
        oos.writeUTF("小明");
        oos.writeInt(12);
        oos.writeBoolean(false);
        oos.writeChar('a');
        Employee employee = new Employee("小军",3500);
        oos.writeObject(employee);
        oos.writeObject("我喜欢写代码");
        oos.writeObject(new Date());
        oos.flush();
        byte[] datas = baos.toByteArray();
        DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",6666));
        client.send(packet);
        client.close();
    }
}
