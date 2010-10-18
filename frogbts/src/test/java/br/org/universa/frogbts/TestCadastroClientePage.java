package br.org.universa.frogbts;

import junit.framework.TestCase;

import org.apache.wicket.util.tester.WicketTester;

/**
 * Simple test using the WicketTester
 */
public class TestCadastroClientePage extends TestCase {
	private WicketTester tester;

	@Override
	public void setUp() {
		tester = new WicketTester(new WicketApplication());
	}

	public void testRenderMyPage() {
		// start and render the test page
		tester.startPage(CadastroFrogbtsPage.class);

		// assert rendered page class
		tester.assertRenderedPage(CadastroFrogbtsPage.class);

		// assert rendered label component
		tester
				.assertLabel("message",
						"If you see this message wicket is properly configured and running");
	}
}
