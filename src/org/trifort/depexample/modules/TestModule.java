/* 
 * Copyright 2013 Phil Pratt-Szeliga
 * http://trifort.org/
 * 
 * See the file LICENSE for copying permission.
 */

package org.trifort.depexample.modules;

import com.google.inject.AbstractModule;
import org.trifort.depexample.IBytecastFsys;
import org.trifort.depexample.IBytecastJimple;
import org.trifort.depexample.fsys.FsysTest;
import org.trifort.depexample.jimple.JimpleTest;

public class TestModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(IBytecastFsys.class).to(FsysTest.class);
    bind(IBytecastJimple.class).to(JimpleTest.class);
  }

}
