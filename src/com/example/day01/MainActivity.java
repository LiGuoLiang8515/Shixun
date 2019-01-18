package com.example.day01;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class MainActivity extends Activity {
	private String string;
	Handler h=new Handler(){
		public void handleMessage(android.os.Message msg) {
			ArrayList<Ma> list=(ArrayList<Ma>) msg.obj;
			
		};
	};
	@Override
	protected void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		new Thread(){
			public void run() {
				//创建URLd对象
				try {
					URL url = new URL("http://192.168.1.28:8080/a/json.txt");
					HttpURLConnection con = (HttpURLConnection) url.openConnection();
					//如果HttpURLConnection的响应码为200
					if (con.getResponseCode()==200) {
						InputStream in =con.getInputStream();
						byte[] b=new byte[1024];
						int len=0;
						StringBuffer sb = new StringBuffer();
						while ((len=in.read(b))!=-1) {
							sb.append(new String(b,0,len,"GBK"));
						}
						
						Gson gson = new Gson();
						ArrayList<Ma> list= gson.fromJson(sb.toString(), new TypeToken<ArrayList<Ma>>(){}.getType());
						System.out.println(list.toString());
						Message msg = new Message();
						msg.obj=list;
						h.handleMessage(msg);
					}
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();
	}
}
