package com.anynines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaDownloaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaDownloaderApplication.class, args);
		
		JavaDownloader java_downloader = new JavaDownloader();
		java_downloader.show_post(3);
	}
}