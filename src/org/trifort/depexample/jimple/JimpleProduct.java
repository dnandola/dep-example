/* 
 * Copyright 2013 Phil Pratt-Szeliga
 * http://trifort.org/
 * 
 * See the file LICENSE for copying permission.
 */

package org.trifort.depexample.jimple;

import java.io.File;
import java.io.PrintWriter;
import org.trifort.depexample.IBytecastJimple;

public class JimpleProduct implements IBytecastJimple {

  @Override
  public void writeJimpleFile(File file, String jimple) {
    File output = new File("output/");
    if(output.exists() == false){
      output.mkdirs();
    }
    String output_filename = output+File.separator+file.getName();
    System.out.println("writing jimple to: "+output_filename);
     
    try {
      PrintWriter writer = new PrintWriter(output_filename);
      writer.println(jimple);
      writer.flush();
      writer.close();
    } catch(Exception ex){
      ex.printStackTrace();
    }
  }

}
