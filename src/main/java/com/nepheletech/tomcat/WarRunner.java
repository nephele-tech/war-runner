package com.nepheletech.tomcat;

import java.io.File;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class WarRunner {

  public static void main(String[] args) throws LifecycleException {
    File webapps = new File("temp/webapps");
    
    if (!webapps.exists()) {
      webapps.mkdirs();
    }
    
    
    Tomcat tomcat = new Tomcat();
    tomcat.setBaseDir("temp");
    tomcat.setPort(8840);
    
    String contextPath = "/";
    String warFilePath = new File("jred-editor-template.war").getAbsolutePath();
    
    //tomcat.getHost().setAppBase(".");
    tomcat.addWebapp(contextPath, warFilePath);
    

    System.out.println(tomcat.getConnector());
    
    tomcat.start();
    tomcat.getServer().await();
  }
}
