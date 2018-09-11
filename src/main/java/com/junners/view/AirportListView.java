package com.junners.view;

import java.util.ArrayList;
import java.util.List;

public class AirportListView {
	private List<AirportView> avl = new ArrayList<AirportView>();

	public void addAirport(AirportView airport) {
		this.avl.add(airport);
	}

	public List<AirportView> getAvl() {
		return avl;
	}

	public void setAvl(List<AirportView> avl) {
		this.avl = avl;
	}

}
