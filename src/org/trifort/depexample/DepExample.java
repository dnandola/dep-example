/* 
 * Copyright 2013 Phil Pratt-Szeliga
 * http://trifort.org/
 * 
 * See the file LICENSE for copying permission.
 */

package org.trifort.depexample;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.trifort.depexample.modules.ProductModule;
import org.trifort.depexample.modules.TestModule;

public class DepExample {

  private void runTestModule() {
    System.out.println("running test module...");
    
    Injector injector = Guice.createInjector(new TestModule());
    BytecastAmd64 amd64 = injector.getInstance(BytecastAmd64.class);
    amd64.run();
    
    System.out.println();
  }

  private void runProductModule() {
    System.out.println("running project module...");
    
    Injector injector = Guice.createInjector(new ProductModule());
    BytecastAmd64 amd64 = injector.getInstance(BytecastAmd64.class);
    amd64.run();
    
    System.out.println();
  }
  
  public static void main(String[] args) {
    DepExample example = new DepExample();
    example.runProductModule();
    example.runTestModule();
  }

}
