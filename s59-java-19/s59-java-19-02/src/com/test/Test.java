package com.test;

import com.impl.StuManagerIMPL;
import com.inter.StuManager;
import com.proxy.MyProxy;

public class Test {
	public static void main(String[] args) {
		StuManager manager = new StuManagerIMPL();
		manager.add();
		MyProxy myProxy = new MyProxy(manager);
		myProxy.add();
		myProxy.del();

	}

}
