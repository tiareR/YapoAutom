package com.yapo.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.yapo.config.BaseConfig;
import com.yapo.dataprovider.IntegratedDataProvider;
import com.yapo.entities.DatosCrearCuenta;
import com.yapo.page.Crear_Cuenta;

public class Crear_Test extends BaseConfig {
	
@Test (description="Crear Cuenta en Yapo", dataProvider = "crear_cuenta", dataProviderClass = IntegratedDataProvider.class)
public void test(DatosCrearCuenta datos) {
	
	Crear_Cuenta registro = new Crear_Cuenta(driver);
	SoftAssert  SF = new SoftAssert();	
	registro.selectCrearCuenta();
	SF.assertTrue(registro.clickPersona(),"no lo hizo");
	SF.assertTrue(registro.IngNombre(datos.getNombre()));
	SF.assertTrue(registro.clickGenero(datos.getGenero()));
	SF.assertTrue(registro.clickRegion(datos.getRegion()));
	SF.assertTrue(registro.clickComuna(datos.getComuna()));
	SF.assertTrue(registro.clickMovil(datos.getCelu()));
	SF.assertTrue(registro.IngEmail(datos.getMail()));
	SF.assertTrue(registro.IngPass(datos.getPass()));
	SF.assertTrue(registro.IngPass2(datos.getPass()));
	SF.assertTrue(registro.clickCondiciones());
	SF.assertTrue(registro.clickBtnCrear());
	SF.assertAll();
	
	
 }
}
