package view;

import static res.R.m;

import model.Gmodel;

public class Output implements View {

	@Override
	public void display() {
		m("¡«¡«¡«¡«¡«¡«¡«¡«¡«¡«" + menulist[(int) dt.get("no")] + "¡«¡«¡«¡«¡«¡«¡«¡«¡«¡«");

		Gmodel[] m = (Gmodel[]) dt.get("arr");

		for (int i = 0; i < m.length; i++) {
			m(m[i].toString());

		}

	}

}
