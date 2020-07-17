package com.yapo.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.yapo.config.BaseConfig;
import com.yapo.dataprovider.IntegratedDataProvider;
import com.yapo.entities.DatosPublicar;
import com.yapo.page.Publicar;

public class Publicar_Test extends BaseConfig {
	@Test (description="Crear Publicacion", dataProvider = "publicar", dataProviderClass = IntegratedDataProvider.class)
	public void test(DatosPublicar datos) {
	Publicar aviso = new Publicar(driver);
	SoftAssert  SF = new SoftAssert();
	aviso.selectpublicar();
	SF.assertTrue(aviso.Categoria(datos.getCateg()));
	SF.assertTrue(aviso.Nuevo(datos.getEstado()));
	SF.assertTrue(aviso.Genero(datos.getGenero()));
	SF.assertTrue(aviso.Talla(datos.getTalla()));
	SF.assertTrue(aviso.Titulo(datos.getTitulo()));
	SF.assertTrue(aviso.Descrip(datos.getDesc()));
	SF.assertTrue(aviso.Precio(datos.getPrecio()));
	SF.assertTrue(aviso.Subida(datos.getSubida()));
	SF.assertTrue(aviso.Region(datos.getRegion()));
	SF.assertTrue(aviso.Comuna(datos.getComuna()));
	SF.assertTrue(aviso.Persona());
	SF.assertTrue(aviso.Nombre(datos.getNombre()));
	SF.assertTrue(aviso.Mail(datos.getMail()));
	SF.assertTrue(aviso.MailVerf(datos.getMail()));
	SF.assertTrue(aviso.Celu(datos.getCelu()));
	SF.assertTrue(aviso.Pass(datos.getPass()));
	SF.assertTrue(aviso.PassVerf(datos.getPass()));
	SF.assertTrue(aviso.Terminos());
	SF.assertTrue(aviso.PublicarBtn());
	SF.assertAll();

		}
}
	

