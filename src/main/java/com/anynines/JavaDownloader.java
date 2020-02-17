package com.anynines;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

public class JavaDownloader {
	public void show_post(Integer id) {

		Integer java_downloader_id = id;
		final String uri = "https://jsonplaceholder.typicode.com/posts/{id}";
		     
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("id", java_downloader_id);
		     
		RestTemplate restTemplate = new RestTemplate();
		JsonplaceholderPost result = restTemplate.getForObject(uri, JsonplaceholderPost.class, params);		     
			
		System.out.println("id: " + result.getId());
		System.out.println("<post-title>" + "\n" + result.getTitle());
		System.out.println("<post-body>" + "\n" + result.getBody());
	}
}