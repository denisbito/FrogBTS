package br.org.universa.frogbts;

import java.util.Arrays;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;

import br.org.universa.frogbts.dao.BugDao;
import br.org.universa.frogbts.entity.Bug;

/**
 * Cadastro de bugs
 * 
 * @param <Prioridade>
 */
public class CadastroFrogbtsPage<Prioridade> extends WebPage {

	private Bug bug = new Bug();

	// TODO Add any page properties or variables here

	/**
	 * Constructor that is invoked when page is invoked without a session.
	 * 
	 * @param parameters
	 *            Page parameters
	 */
	@SuppressWarnings("serial")
	public CadastroFrogbtsPage(final PageParameters parameters) {

		List<String> status = Arrays.asList(new String[] { "novo", "aberto",
				"pendente", "atribuuido", "resolvido", "fechado" });
		List<String> prioridade = Arrays.asList(new String[] { "alta", "media",
				"baixa" });

		Form<Object> form = new Form<Object>("form");
		add(form);

		form.add(new TextField<String>("chave", new PropertyModel<String>(this,
				"bug.chave")));
		form.add(new TextField<String>("status", new PropertyModel<String>(
				this, "bug.status")));
		form.add(new TextField<String>("prioridade", new PropertyModel<String>(
				this, "bug.prioridade")));
		// form.add(new DropDownChoice("status", new
		// PropertyModel<Status>(this,"bug.status")));
		// form.add(new DropDownChoice("prioridade", new
		// PropertyModel<Prioridade>(this,"bug.prioridade")));
		form.add(new TextField<String>("descricao", new PropertyModel<String>(
				this, "bug.descricao")));
		form.add(new Button("btnGravar") {
			public void onSubmit() {
				System.out.println(bug.getChave());
				BugDao bugDao = new BugDao();
				bugDao.inserirBug(bug);
				setResponsePage(CadastroFrogbtsRespostaPage.class);
			};
		});
	}

}
