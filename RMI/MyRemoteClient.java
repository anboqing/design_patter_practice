/*************************************************************************
	> File Name: MyRemoteClient.java
	> Author: HunkAnn
	> Mail: hunkann@gmail.com 453775948@qq.com 
	> Created Time: Sun 29 Mar 2015 08:28:53 PM CST
 ************************************************************************/

import java.rmi.*;

public class MyRemoteClient{
    public static void main(String[] args){
        new MyRemoteClient().go();
    }
    public void go(){
        try{
            MyRemote service = (MyRemote)Naming.lookup("rmi://test:18888/sayHello");
            String s = service.method("安勃卿");
            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

