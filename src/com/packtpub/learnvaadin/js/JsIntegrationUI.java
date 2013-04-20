package com.packtpub.learnvaadin.js;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class JsIntegrationUI extends UI {

	@Override
	protected void init(VaadinRequest request) {

		setContent(new ThreeJs());
	}
}