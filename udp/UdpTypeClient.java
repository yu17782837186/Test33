package cn.com.inet;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpTypeClient {
    //将基本类型转换成字节数组
    public static void main(String[] args) throws IOException {
        System.out.println("发送方启动中。。。");
//        DatagramSocket client = new DatagramSocket(8888);
//        //准备数据 转换成字节数组 然后写出
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(baos));
//        //操作数据类型加数据
//        dos.writeUTF("快乐的学习");
//        dos.writeInt(15);
//        dos.writeBoolean(true);
//        dos.writeChar('a');
//        dos.flush();
//        byte[] datas = baos.toByteArray();
//        DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",6666));
//        client.send(packet);
//        client.close();
        DatagramSocket client = new DatagramSocket(8888);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        dos.writeUTF("小金");
        dos.writeInt(15);
        dos.writeBoolean(false);
        dos.writeChar('a');
        dos.flush();
        byte[] datas = baos.toByteArray();
        DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",6666));
        client.send(packet);
        client.close();
    }
}
