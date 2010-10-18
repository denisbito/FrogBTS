package br.org.universa.frogbts;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;

public class LoginPage extends WebPage {

	public LoginPage() {
		Form loginForm = new Form("form_login");
		this.add(loginForm);

		loginForm.add(new Button("btn_submit") {
			@Override
			public void onSubmit() {
				setResponsePage(BugListPage.class);
			}
		});
	}

}
