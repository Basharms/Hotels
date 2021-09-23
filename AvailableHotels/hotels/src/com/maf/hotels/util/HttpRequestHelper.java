/**
 * 
 */
package com.maf.hotels.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Administrator
 *
 */
public class HttpRequestHelper {
	
	
	/**
	 * This  method used to make http call to the provided url.
	 * @param reqUrl
	 * @param requestParameters
	 * @return
	 */
	public static String sendHttpPost(String reqUrl, String requestParameters) {
		
		String response = "";
		
		try {
			StringBuilder output = null;
			// Prepare the request
			URL url = new URL(reqUrl);
			HttpURLConnection  conn = (HttpURLConnection )url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			
			OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
			
			// Write parameters
            writer.write(requestParameters);
            writer.flush();
            
            // Get the response
            output = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line;
			
            while ((line = reader.readLine()) != null) {
                output.append(line);
            }
            
            writer.close();
            reader.close();
            
            response = output.toString();
            System.out.println("Response :: " + response);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}
	

}
