package com.yapo.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.yapo.config.BaseConfig;
import com.yapo.dataprovider.IntegratedDataProvider;
import com.yapo.entities.DatosBusqueda;
import com.yapo.page.Buscar_Arriendo;


public class Buscar_Test extends BaseConfig {
	@Test(description="Buscar Arriendo en Yapo", dataProvider = "busqueda", dataProviderClass = IntegratedDataProvider.class)
	public void test(DatosBusqueda datos) {
	SoftAssert soft = new SoftAssert();	
	Buscar_Arriendo buscar = new Buscar_Arriendo(driver);
	buscar.selectMetropolitana();
	soft.assertTrue(buscar.clickRegion(datos.getRegion()),"se cayo :C");
	soft.assertTrue(buscar.texto(datos.getTexto()));
	soft.assertTrue(buscar.clickComuna());
	soft.assertTrue(buscar.clickCheck());
	soft.assertTrue(buscar.clickCategoria(datos.getCategoria()));
	soft.assertTrue(buscar.tipoPropiedad(datos.getTipo()));
	soft.assertTrue(buscar.preMin(datos.getMinimP()));
	soft.assertTrue(buscar.preMax(datos.getMaxP()));
	soft.assertTrue(buscar.SelectdorMin(datos.getMinimD()));
	soft.assertTrue(buscar.SelectdorMax(datos.getMaxD()));
	soft.assertTrue(buscar.Selectm2Min(datos.getMinMt2()));
	soft.assertTrue(buscar.Selectm2Max(datos.getMaxMt2()));
	soft.assertTrue(buscar.SelectbanoMin(datos.getMinB()));
	soft.assertTrue(buscar.SelectbanoMax(datos.getMaxB()));
	soft.assertTrue(buscar.SelectGastoMin(datos.getMinGc()));
	soft.assertTrue(buscar.SelectGastoMax(datos.getMaxGc()));
	soft.assertTrue(buscar.SelectParking(datos.getEst()));
	buscar.pressSearch();
	soft.assertAll();
	}
}

