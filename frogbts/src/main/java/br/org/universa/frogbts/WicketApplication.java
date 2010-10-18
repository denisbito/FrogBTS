package br.org.universa.frogbts;

import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your web application. If you want to run this
 * application without deploying, run the Start class.
 * 
 * @see br.org.universa.frogbts.Start#main(String[])
 */
public class WicketApplication extends WebApplication {

	/**
	 * Constructor
	 */
	public WicketApplication() {
	}

	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	public Class<LoginPage> getHomePage() {
		return LoginPage.class;
	}

}
