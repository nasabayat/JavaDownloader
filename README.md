# JavaDownloader

## JavaDownloaderApplication
Main class which includes @SpringBootApplication

## JsonplaceholderPost
object of bwlo URL:
https://jsonplaceholder.typicode.com/posts 

## JavaDownloader
Get Title and Body regarding the id.

# How to use
```bash
package test;

import com.anynines.JavaDownloader;

public class test1 {
	public static void main(String[] args) {
		JavaDownloader j = new JavaDownloader();
		j.show_post(3);
	}
}
```
