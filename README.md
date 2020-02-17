# JavaDownloader

## JavaDownloaderApplication
Main class which includes @SpringBootApplication

## JsonplaceholderPost
object of bewlo URL:
https://jsonplaceholder.typicode.com/posts 

## JavaDownloader
Get Title and Body regarding the id.

# How to use
```bash
package test;

import com.anynines.JavaDownloader;
import com.anynines.Warmup;

public class test1 {
	public static void main(String[] args) {
//		JavaDownloader j = new JavaDownloader();
//		System.out.print(j.show_post(3).getId());
//		j.show_post(3);
		
//		Warmup.greeting();
		JavaDownloader path = new JavaDownloader("/tmp");
		path.download_post(3);
	}
}
```
