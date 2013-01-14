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
import org.trifort.depexample.fsys.FsysProduct;
import org.trifort.depexample.jimple.JimpleProduct;

public class ProductModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(IBytecastFsys.class).to(FsysProduct.class);
    bind(IBytecastJimple.class).to(JimpleProduct.class);
  }

}
