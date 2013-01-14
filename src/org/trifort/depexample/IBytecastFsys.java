/* 
 * Copyright 2013 Phil Pratt-Szeliga
 * http://trifort.org/
 * 
 * See the file LICENSE for copying permission.
 */

package org.trifort.depexample;

import java.io.File;
import java.util.List;

public interface IBytecastFsys {

  public void setRoot(File file);
  public List<File> getObjects();
  public String getObject(File object);
  
}
