package br.org.universa.frogbts;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.FeedbackPanel;

public class BugListPage extends WebPage {

	public BugListPage() {
		// this.add(new Label("Label"));
		add(new FeedbackPanel("feedback"));
		this.add(new Link("link_bugnew") {
			@Override
			public void onClick() {
				this.setResponsePage(CadastroFrogbtsPage.class);
			}
		});
	}

}
