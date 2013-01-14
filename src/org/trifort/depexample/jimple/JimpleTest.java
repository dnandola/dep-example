/* 
 * Copyright 2013 Phil Pratt-Szeliga
 * http://trifort.org/
 * 
 * See the file LICENSE for copying permission.
 */

package org.trifort.depexample.jimple;

import java.io.File;
import org.trifort.depexample.IBytecastJimple;

public class JimpleTest implements IBytecastJimple{

  @Override
  public void writeJimpleFile(File file, String jimple) {
    System.out.println("printing: "+file.toString());
    System.out.println("  "+jimple);
  }

}
