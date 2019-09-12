package cn.com.inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpClient1 {
    //发送端
    //1 使用DatagramSocket 指定端口 创建发送端
    //2 准备数据 一定转成字节数组
    //3 封装成DatagramPacket 包裹，需要指定目的地
    //4 发送包裹sent(DatagramPacket p)
    //5 释放资源
    public static void main(String[] args) throws IOException {
//        System.out.println("发送方启动中。。。");
//        //创建发送端 指定端口
//        DatagramSocket client = new DatagramSocket(8888);
//        //转成字节数组
//        String data = "每天努力学习，少说话，多敲代码。。。。";
//        byte[] datas = data.getBytes();
//        //打包
//        DatagramPacket packet = new DatagramPacket
//                (datas,0,datas.length,new InetSocketAddress("localhost",6666));
//        //发送包裹
//        client.send(packet);
//        //释放资源
//        client.close();
        System.out.println("发送方启动中。。。");
        DatagramSocket client = new DatagramSocket(8888);
        String data = "我要好好的努力学习，从而走向人生的巅峰。。。";
        byte[] datas = data.getBytes();
        DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",6666));
        client.send(packet);
        client.close();
    }
}
