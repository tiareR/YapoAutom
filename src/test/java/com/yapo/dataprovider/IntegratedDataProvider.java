package com.yapo.dataprovider;

import org.testng.annotations.DataProvider;

import com.google.gson.Gson;
import com.yapo.entities.DatosBusqueda;
import com.yapo.entities.DatosCrearCuenta;
import com.yapo.entities.DatosPublicar;

public class IntegratedDataProvider {

	@DataProvider
	public static Object[][] crear_cuenta() {
		Gson gson = new Gson();
		DatosCrearCuenta cont = gson.fromJson(FileDataProvider.asString(String.format("./resource/Cuenta.json")),
				DatosCrearCuenta.class);

		return new Object[][] { { cont } };
	}
	@DataProvider
	public static Object[][] busqueda() {
		Gson gson = new Gson();
		DatosBusqueda cont = gson.fromJson(FileDataProvider.asString(String.format("./resource/Buscar.json")),
				DatosBusqueda.class);

		return new Object[][] { { cont } };
	}
	@DataProvider
	public static Object[][] publicar() {
		Gson gson = new Gson();
		DatosPublicar cont = gson.fromJson(FileDataProvider.asString(String.format("./resource/Publicar.json")),
				DatosPublicar.class);

		return new Object[][] { { cont } };
	}
	
}
