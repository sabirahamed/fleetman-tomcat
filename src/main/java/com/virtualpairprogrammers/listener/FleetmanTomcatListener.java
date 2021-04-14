package com.virtualpairprogrammers.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class FleetmanTomcatListener implements ServletContextListener {
	@Override
	  public void contextInitialized (ServletContextEvent sce) {
	      System.out.println("from ServletContextListener: " +
	                                   " context initialized");

	  }

	  @Override
	  public void contextDestroyed (ServletContextEvent sce) {

	  }
}
