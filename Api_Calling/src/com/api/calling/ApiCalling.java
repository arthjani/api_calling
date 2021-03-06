package com.api.calling;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ApiCalling {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
	  
	
		var url = "https://api-rv.herokuapp.com/rv/v1";
		
		var request = HttpRequest.newBuilder().GET().uri(URI.create(url))
				     // .header("content-type", "multipart/form-data; boundary=---011000010111000001101001")
				     // .header("x-rapidapi-host", "ai-picture-enlarger.p.rapidapi.com")
				     // .header("x-rapidapi-key", "SIGN-UP-FOR-KEY")
				      .build();
		var client = HttpClient.newBuilder().build();
		var response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		
		
		System.out.println(response.statusCode());
		System.out.println(response.body());


	}

}
