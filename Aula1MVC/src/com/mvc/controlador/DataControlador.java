package com.mvc.controlador;

import com.mvc.modelo.Data;

public class DataControlador {
	
	public String getDataCerta() {
		Data data = new Data();
		return data.getData();
	}

}
