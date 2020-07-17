package com.yapo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.yapo.config.BaseConfig;

public class Crear_Cuenta  extends BaseConfig{

	public Crear_Cuenta(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//*[@id=\"account_create_form\"]/fieldset/div[1]/div[1]/div/div[1]/div/ins")
	public WebElement persona;
	@FindBy(id = "account_name")
	public WebElement nombre;
	@FindBy(xpath = "//*[@id=\"account_create_form\"]/fieldset/div[1]/div[5]/div/div[2]/div/ins")
	public WebElement femenino;
	@FindBy (xpath = "//*[@id=\"account_create_form\"]/fieldset/div[1]/div[5]/div/div[1]/div/ins")
	public WebElement masculino;
	@FindBy(id = "account_region")
	public WebElement region;
	@FindBy(id = "account_commune")
	public WebElement comuna;
	@FindBy(id = "phone")
	public WebElement celu;
	@FindBy(id = "account_email")
	public WebElement mail;
	@FindBy(id = "account_password")
	public WebElement pass;
	@FindBy(id = "account_password_verify")
	public WebElement passV;
	@FindBy(xpath = "//*[@id=\"label_accept_conditions\"]/div/ins")
	public WebElement check;
	@FindBy(xpath = "//*[@id=\"edit_profile_btn\"]")
	public WebElement enviar;

	public boolean clickPersona () {
		try {
			persona.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean IngNombre (String Nombre) {
		try {
			nombre.sendKeys(Nombre);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean clickGenero (String Genero) {
		try {
			
			if(Genero.equals("femenino")) {
				femenino.click();
			}else if (Genero.equals("masculino")) {
				masculino.click();
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean clickRegion (String Region) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(region));
			Select selectRegion = new Select(region);
			selectRegion.selectByVisibleText(Region);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean clickComuna (String Comuna) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(comuna));
			Select selectRegion = new Select(comuna);
			selectRegion.selectByVisibleText(Comuna);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean clickMovil (String Celu) {
		try {
			celu.sendKeys(Celu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean IngEmail (String Mail) {
		try {
			mail.sendKeys(Mail);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean IngPass (String Pass) {
		try {
			pass.sendKeys(Pass);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean IngPass2 (String Pass) {
		try {
			passV.sendKeys(Pass);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}	
	
	public boolean clickCondiciones () {
		try {
			check.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean clickBtnCrear () {
		try {
			enviar.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public void selectCrearCuenta() {
		driver.get("https://www2.yapo.cl/cuenta/form/0");
	}
	
}


