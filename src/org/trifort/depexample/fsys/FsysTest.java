/* 
 * Copyright 2013 Phil Pratt-Szeliga
 * http://trifort.org/
 * 
 * See the file LICENSE for copying permission.
 */

package org.trifort.depexample.fsys;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.trifort.depexample.IBytecastFsys;

public class FsysTest implements IBytecastFsys {

  public Map<File, String> m_map;
  
  public FsysTest(){
    m_map = new HashMap<File, String>();
    m_map.put(new File("BytecastAmd64.class"), "hello from bytecast-amd64");
    m_map.put(new File("DepExample.class"), "hello from dep-example");
  }
  
  @Override
  public void setRoot(File file) {
    //ignore
  }

  @Override
  public List<File> getObjects() {
    List<File> ret = new ArrayList<File>();
    ret.addAll(m_map.keySet());
    return ret;
  }

  @Override
  public String getObject(File object) {
    return m_map.get(object);
  }

}
