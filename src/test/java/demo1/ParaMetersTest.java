package demo1;

import org.testng.annotations.Test;

public class ParaMetersTest {
 @Test
 public void params() {
  String url=System.getProperty("url");
  String username=System.getProperty("username");
  String password=System.getProperty("password");
  
  System.out.println(url);
  System.out.println(username);
  System.out.println(password);
  
 }
}