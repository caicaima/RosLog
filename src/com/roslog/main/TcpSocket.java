package com.roslog.main;


public class TcpSocket {
/**
	public static void main(String[] args) throws IOException {
		int port = 12345;
		ServerSocket server = new ServerSocket(port);
		Socket socket=null;
	
		 socket = server.accept();
		 Reader reader = new InputStreamReader(socket.getInputStream());
			char chars[] = new char[64];  
		      int len;  
		      StringBuilder sb = new StringBuilder();  
		      String temp;  
		      int index;  
		      while ((len=reader.read(chars)) != -1) {  
		         temp = new String(chars, 0, len);  
		         if ((index = temp.indexOf("eof")) != -1) {//遇到eof时就结束接收  
		            sb.append(temp.substring(0, index));  
		            break;  
		         }  
		         sb.append(temp);  
		      }  
		      System.out.println("from client: " + sb);  
		      //读完后写一句  
		      Writer writer = new OutputStreamWriter(socket.getOutputStream());  
		      writer.write("Hello Client.");  
		      writer.flush();  
		      writer.close();  
		      reader.close();  
		  //    socket.close();  
		   //   server.close(); 
		}
	**/
	
}
