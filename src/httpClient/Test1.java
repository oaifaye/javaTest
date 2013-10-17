package httpClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;

/**
 * 用GET方法来取得某网页内容的代码
 * */
public class Test1 {
	public static void main(String[] args) {

		// createClient("http://www.baidu.com");
		Map<String , String> params = new HashMap<String , String>();
		params.put("pageLoginuser.lucode", "t11");
		params.put("pageLoginuser.lupass", "");
		params.put("pageLoginuser.userPermission.icode", "02");
		params.put("pageLoginuser.luname", "12");
		params.put("pageLoginuser.department.icode", "201203200001");
		params.put("pageLoginuser.principal", "1");
		params.put("pageLoginuser.contact", "1");
		params.put("pageLoginuser.reportSector", "1");
		params.put("pageLoginuser.reportPerson", "1");
		params.put("pageLoginuser.principal", "01");
		params.put("ptCodes", "201206120037");
		params.put("pageLoginuser.status", "0");
		getPhoneAdress("http://localhost:8888/jwsz/addUser.action;jsessionid=11E0C618800A5C6230BD43CA323EF656",params);
//		params.put("lucode", "ct");
//		params.put("lupass", "111111");
//		getPhoneAdress("http://localhost:8888/jwsz/login.action",params);
		// showPager("www.baidu.com");
	}

	public static void createClient(String url) {
		try {
			HttpClient httpclient = new DefaultHttpClient();
			// 使用 GET 方法 ，如果服务器需要通过 HTTPS 连接，那只需要将下面 URL 中的 http 换成 https
			HttpGet httpget = new HttpGet(url);
			System.out.println("get提交： " + httpget.getURI());

			HttpResponse response = httpclient.execute(httpget);
			HttpEntity entity = response.getEntity();
			System.out.println("----------------------------------------");
			System.out.println(response.getStatusLine()); // HTTP/1.1 200 OK
															// ;Http/1.1
															// 表示当前协议为Http,1.1是协议的版本,200表示成功，
			if (entity != null) {
				System.out.println("Response content length: "
						+ entity.getContentLength());
				
				String content = EntityUtils.toString(response.getEntity());
				System.out.println(content);
			}
			
			// 关闭
			httpget.abort();
			httpclient.getConnectionManager().shutdown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 查询手机号码所在的城市
	 * 
	 * @throws IOException
	 * @throws ClientProtocolException
	 * */
	public static void getPhoneAdress(String url , Map<String , String> params ) {
		try {
			// 定义HttpClient
			HttpClient client = new DefaultHttpClient();

			// 实例化HTTP方法
			HttpPost httppost = new HttpPost(url);
			//HttpPost httppost = new HttpPost("http://localhost:8888/daily/user_login");

			// 创建名/值组列表
			List<NameValuePair> parameters = new ArrayList<NameValuePair>();
			// 获取params全部的key
			Set<String> keySet = params.keySet();
			Iterator<String> keyIterator = keySet.iterator();
			while (keyIterator.hasNext()) {
				String key = keyIterator.next();
				String value = params.get(key);
				parameters.add(new BasicNameValuePair( key , value ));
			}

			// 设置字符集
			HttpEntity httpentity = new UrlEncodedFormEntity(parameters,"utf-8");

			httppost.setEntity(httpentity);
			
			// 执行请求
			HttpResponse response = client.execute(httppost);

			// 对于要求接受后继服务的请求，象POST和PUT等不能自动处理转发
			// 301或者302
			if (response.getStatusLine().getStatusCode() == 302) {  
			    String locationUrl=response.getLastHeader("Location").getValue(); 
			    if (locationUrl != null) {
			    	 System.out.println("post提交，重定向到: "+locationUrl);
			    	 createClient(locationUrl);
			    } else {
			    	 System.err.println("Location field value is null.");
			    }
			} else{
				HttpEntity entity = response.getEntity();
				String content = EntityUtils.toString(entity);
				System.out.println("直接跳转到： "+content);
			}
			
			// 关闭
			httppost.abort();
			client.getConnectionManager().shutdown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取页面内容
	 * */
	@SuppressWarnings("deprecation")
	public static void showPager(String url) {
		try {

			HttpHost target = new HttpHost(url, 80, "http");

			// general setup
			SchemeRegistry supportedSchemes = new SchemeRegistry();

			// Register the "http" protocol scheme, it is required
			// by the default operator to look up socket factories.
			supportedSchemes.register(new Scheme("http", PlainSocketFactory
					.getSocketFactory(), 80));

			// prepare parameters
			HttpParams params = new BasicHttpParams();
			HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
			HttpProtocolParams.setContentCharset(params, "UTF-8");
			HttpProtocolParams.setUseExpectContinue(params, true);

			ClientConnectionManager connMgr = new ThreadSafeClientConnManager(
					params, supportedSchemes);
			DefaultHttpClient httpclient = new DefaultHttpClient(connMgr,
					params);

			HttpGet req = new HttpGet("/");

			System.out.println("executing request to " + target);

			HttpResponse rsp = httpclient.execute(target, req);
			HttpEntity entity = rsp.getEntity();

			System.out.println("----------------------------------------");
			System.out.println(rsp.getStatusLine());
			Header[] headers = rsp.getAllHeaders();
			for (int i = 0; i < headers.length; i++) {
				System.out.println(headers[i]);
			}
			System.out.println("----------------------------------------");

			if (entity != null) {
				System.out.println(EntityUtils.toString(entity));
			}

			// When HttpClient instance is no longer needed,
			// shut down the connection manager to ensure
			// immediate deallocation of all system resources
			httpclient.getConnectionManager().shutdown();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
