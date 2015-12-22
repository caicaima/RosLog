package com.roslog.main;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import org.apache.log4j.Logger;

public class LogServer {

	private static Logger logger = Logger.getLogger(LogServer.class.getName());

	public static void main(String[] args) throws IOException {
		int count = 0;
		DatagramSocket server = new DatagramSocket(12345);
		byte[] b = new byte[1024];
		DatagramPacket packet = new DatagramPacket(b, 100);
		while (true) {
			server.receive(packet);
			//packet.getData();
			String log = new String(b, "GBK");
			if (log.startsWith("pppoe") || log.contains("debug")) {
				System.out.println("过滤掉  " + (++count) + "条信息");
			} else {
				
				//String log1 = log.substring(0, 70);
				logger.info(log);
				System.out.println("data..." + log);
			}

		}
	}
}
