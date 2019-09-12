package cn.com.inet;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Date;

public class UdpObjectServer {
    //引用类型 接收端
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("接收端启动中。。。");
//        DatagramSocket server = new DatagramSocket(6666);
//        byte[] container = new byte[1024*60];
//        DatagramPacket packet = new DatagramPacket(container,0,container.length);
//        server.receive(packet);
//        byte[] data = packet.getData();
//        int len = packet.getLength();
//        //反序列化  读取
//        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(data)));
//        //顺序与写出一致
//        String str = ois.readUTF();
//        int tmp = ois.readInt();
//        boolean flag = ois.readBoolean();
//        char ch = ois.readChar();
//        //对象的数据还原
//        Object str1 = ois.readObject();
//        Object date = ois.readObject();
//        Object employee = ois.readObject();
//        if (str1 instanceof String) {
//            String str1obj = (String) str1;
//            System.out.println(str1obj);
//        }
//        if (date instanceof Date) {
//            Date dateobj = (Date)date;
//            System.out.println(dateobj);
//        }
//        if (employee instanceof Employee) {
//            Employee employee1 = (Employee) employee;
//            System.out.println(employee1.getName()+"-->"+employee1.getSalary());
//        }
//        System.out.println(str+"--"+tmp+"--"+flag+"--"+ch);
//        server.close();
        DatagramSocket server = new DatagramSocket(6666);
        byte[] container = new byte[1024*60];
        DatagramPacket packet = new DatagramPacket(container,0,container.length);
        server.receive(packet);
        byte[] data = packet.getData();
        int len = packet.getLength();
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(data)));
        String str = ois.readUTF();
        int tmp = ois.readInt();
        boolean flag = ois.readBoolean();
        char ch = ois.readChar();
        Object emp = ois.readObject();
        Object str1 = ois.readObject();
        Object date = ois.readObject();
        if (emp instanceof Employee) {
            Employee employee = (Employee)emp;
            System.out.println(employee.getName()+"-->"+employee.getSalary());
        }
        if (str1 instanceof String) {
            String string = (String)str1;
            System.out.println(string);
        }
        if (date instanceof Date) {
            Date date1 = (Date)date;
            System.out.println(date1);
        }

        server.close();
    }
}
