package cn.com.inet;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpTypeServer {
    //将基本类型转换字节数组
    public static void main(String[] args) throws IOException {
//        DatagramSocket server = new DatagramSocket(6666);
//        byte[] container = new byte[1024*60];
//        DatagramPacket packet = new DatagramPacket(container,0,container.length);
//        server.receive(packet);
//        byte[] data = packet.getData();
//        int len = packet.getLength();
//        DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(data)));
//        //顺序与写出一致   读取
//        String msg = dis.readUTF();
//        int tmp = dis.readInt();
//        boolean flag = dis.readBoolean();
//        char ch = dis.readChar();
//        System.out.println(msg+"--"+tmp);
//        System.out.println(flag+"--"+ch);
//        server.close();
        System.out.println("接受端启动中。。。");
      DatagramSocket server = new DatagramSocket(6666);
      byte[] container = new byte[1024*60];
      DatagramPacket packet = new DatagramPacket(container,0,container.length);
      server.receive(packet);
      byte[] datas = packet.getData();
      //int len = packet.getLength();
      DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
      String msg = dis.readUTF();
      int tmp = dis.readInt();
      boolean flag = dis.readBoolean();
      char ch = dis.readChar();
      System.out.println(msg+"--"+flag);
      server.close();
    }
}
