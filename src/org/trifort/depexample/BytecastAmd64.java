/* 
 * Copyright 2013 Phil Pratt-Szeliga
 * http://trifort.org/
 * 
 * See the file LICENSE for copying permission.
 */

package org.trifort.depexample;

import com.google.inject.Inject;
import java.io.File;
import java.util.List;

public class BytecastAmd64 {

  IBytecastFsys m_fsys;
  IBytecastJimple m_jimple;
  
  @Inject
  public BytecastAmd64(IBytecastFsys fsys, IBytecastJimple jimple){
    m_fsys = fsys;
    m_jimple = jimple;
  }
  
  public void run(){
    File root = new File("input/");
    m_fsys.setRoot(root);
    List<File> files = m_fsys.getObjects();
    for(File file : files){
      String contents = m_fsys.getObject(file);
      m_jimple.writeJimpleFile(file, contents);
    }
  }
}
