package com.anynines;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

public class JavaDownloader {
	private Path path;
	private static String filePath;
	
	public JavaDownloader() {	
	}
	
	public JavaDownloader(String path) {
		this.path =  Paths.get(path);	
	}
	
	public JsonplaceholderPost show_post(Integer id) {

		Integer java_downloader_id = id;
		final String uri = "https://jsonplaceholder.typicode.com/posts/{id}";
		     
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("id", java_downloader_id);
		     
		RestTemplate restTemplate = new RestTemplate();
		JsonplaceholderPost result = restTemplate.getForObject(uri, JsonplaceholderPost.class, params);	
		
		// Below line should be uncommented to have output as mentioned in 2nd part (Download a post)
		//System.out.println("Titile: \n" + result.getTitle() + "\nBody:\n" + result.getBody());

		return result;
	}	
	
	public void download_post(Integer id) {
		JsonplaceholderPost rs = show_post(id);
		filePath = path.toString().concat("/post").concat(id.toString()).concat(".txt");
		
		//String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";
		
	    try {
	    	BufferedWriter wr = new BufferedWriter(new FileWriter(filePath));
		    wr.write("Titile:\n".concat(rs.getTitle().toString()));
		    wr.write("\nBody:\n".concat(rs.getBody().toString()));
		    wr.close();
	    }
	    catch (Exception ex) {
          ex.printStackTrace();
       }
	}
}