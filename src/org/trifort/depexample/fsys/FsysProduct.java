/* 
 * Copyright 2013 Phil Pratt-Szeliga
 * http://trifort.org/
 * 
 * See the file LICENSE for copying permission.
 */

package org.trifort.depexample.fsys;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import org.trifort.depexample.IBytecastFsys;

public class FsysProduct implements IBytecastFsys {

  private File m_root;
  
  @Override
  public void setRoot(File file) {
    m_root = file;
  }

  @Override
  public List<File> getObjects() {
    File[] children = m_root.listFiles();
    List<File> ret = new ArrayList<File>();
    for(File file : children){
      if(file.getName().endsWith(".class")){
        ret.add(file);
      }
    }
    return ret;
  }

  @Override
  public String getObject(File object) {
    try {
      BufferedReader reader = new BufferedReader(new FileReader(object));
      StringBuilder ret = new StringBuilder();
      while(true){
        String line = reader.readLine();
        if(line == null){
          break;
        }
        ret.append(line);
        ret.append("\n");
      }
      return ret.toString();
    } catch(Exception ex){
      ex.printStackTrace();
    }
    return "";
  }

}
