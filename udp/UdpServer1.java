package cn.com.inet;



import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer1 {
    //接收端
    //1 使用DatagramSocket 指定端口 创建接收端
    //2 准备容器 封装成DatagramPacket 包裹
    //3 阻塞式接受包裹receive(DatagramPacket p)
    //4 分析数据
    // byte[] getData()
    //        getLength()
    //5 释放资源
    public static void main(String[] args) throws IOException {
//        System.out.println("接受方启动中。。。");
//        //创建接受端 指定端口  同一个协议下端口不允许冲突
//        DatagramSocket server = new DatagramSocket(6666);
//        //准备容器 封装成DatagramPacket 包裹
//        byte[] container = new byte[1024*60];
//        DatagramPacket packet = new DatagramPacket(container,0,container.length);
//        //阻塞式接受包裹
//        server.receive(packet);
//        //拿数据
//        byte[] datas = packet.getData();
//        int len = packet.getLength();
//        //直接转换为字符串
//        System.out.println(new String(datas,0,len));
//        //释放资源
//        server.close();
        System.out.println("接受方启动中。。。");
        DatagramSocket server = new DatagramSocket(6666);
        byte[] container = new byte[1024*60];
        DatagramPacket packet = new DatagramPacket(container,0,container.length);
        server.receive(packet);
        byte[] data = packet.getData();
        int len = packet.getLength();
        System.out.println(new String(data,0,len));
        server.close();
    }
}
