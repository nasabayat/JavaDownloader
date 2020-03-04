# JavaDownloader

## Programming
I’ve done the following modification to do the programming task.
- Java is the programming language which I used.
- Regarding the programming language (java), name of variables/method change form ruby/Ruby to java/Java.

  ruby_downloader = RubyDownloader.new

  Changed to:
  
  java_downloader = JavaDownloader.new

- Eclipse is the IDE which I used and Spring as framework for REST client API.

- JavaDownloader is the name of a project which was created for this purpose.

- Package, com.anynines is the one which contains all required classes for this task.

- JavaDownloader includes below classes:

* Warmup.java

  Do the first task and print “Hello, World!”
	  
* JsonplaceholderPost.java

  Class which contains variables of below URL as its properties and related get/set methods.
  
  https://jsonplaceholder.typicode.com/posts

* JavaDownloader.java
	
  Implementation of Resource and Repository of the REST client API from Spring Point of view.
	   
  Include two following methods:
	   
  ### show_post(Integer id)
  
  Provide output that meets the requirement of the 2nd task, just needed to uncomment the following line.

```bash
  //System.out.println("Titile: \n" + result.getTitle() + "\nBody:\n" + result.getBody());
```
	   
   ### download_post(Integer id)
   
   Show_post refactor to save output in a file as requested in task 3, Return value added to the method and also remove 
   
   print to the stdout.
   
   ### JavaDownloader(String path)
   
   Constructor which is required for the 3rd task.
   
* JavaDownloaderApplication.java

  Spring Suite Tool (STS) creates a consumer class for REST service.

## How to check?

- To check the code, one new project as test can be created and then add the JavaDownloader to it as following:

  1- Right click on your project
  
  2- Select Build Path
  
  3-  Click on Configure Build Path

  4- Click on Libraries and select Add External JARs
  
  5- Select the jar file from the required folder

  6- Click and Apply and Ok
  
  Below is the test.java which is needed for this purpose.
  
```bash
import com.anynines.*;
public class test {
	public static void main(String[] args) {
		// Uncomment below line for the first task.
		// Warmup.greeting();
		// For the 2nd task, uncomment belo line firs in show_post(Integer id) method.
		//System.out.println("Titile: \n" + result.getTitle() + "\nBody:\n" + result.getBody());
		// then uncomment below line in test.java
		// JavaDownloader java_downloader = new JavaDownloader();
		// java_downloader..show_post(3);
		// Uncomment below lines to check the 3rd task, Save the post
		// JavaDownloader path = new JavaDownloader("/tmp");
		// path.download_post(3);
	}
}

```
