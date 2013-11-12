package socket;

import java.net.NetworkInterface;
import java.util.Enumeration;

public class InteAddressExample {

	public static void main(String[] args) throws Exception {
		//获取主机网络接口列表
		Enumeration<NetworkInterface> interfaceList = NetworkInterface.getNetworkInterfaces();
		
		if(interfaceList!=null){
			while(interfaceList.hasMoreElements()){
				NetworkInterface iface = interfaceList.nextElement();
				//打印接口名
				System.out.println("Inetface"+iface.getName());
				//打印ip
				System.out.println(iface.getInetAddresses().nextElement());
			}
		}
	}
}
