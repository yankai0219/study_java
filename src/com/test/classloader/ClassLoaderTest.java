package com.test.classloader;

import java.net.*;
import java.io.*;

import com.classloader.ActionInterface;

public class ClassLoaderTest {
	public static void main(String args[]) {
		 try
		   {  
		    File file=new File("D:/Download/a.txt");
		    BufferedReader in=new BufferedReader(new FileReader(file));
		       String s=new String();
		       while((s=in.readLine())!=null)
		       {
		         
		   // URL url=new URL(s);
		  //  s=null;
		    URL url1=new URL("file:D:adfaaa1.jar");
		    URLClassLoader myClassLoader=new URLClassLoader(new URL[]{url1},Thread.currentThread().getContextClassLoader());
		    Class myClass=myClassLoader.loadClass("com.classloader2.TestAction0");
		       ActionInterface action=(ActionInterface)myClass.newInstance();
		    String str=action.action();
		    System.out.println(str);
		    
		   }
		   }
		   catch(Exception e)
		   {
		    e.printStackTrace();
		   }
	}
}
