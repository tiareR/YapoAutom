package com.yapo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.yapo.config.BaseConfig;

public class Publicar extends BaseConfig {
	public Publicar(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id= "category_group")
	public WebElement categ;
	@FindBy (id= "condition")
	public WebElement estado;
	@FindBy (id= "gender")
	public WebElement genero;
	@FindBy (id= "clothing_size")
	public WebElement talla;
	@FindBy (id= "subject")
	public WebElement titulo;
	@FindBy (id= "body")
	public WebElement desc;
	@FindBy (id= "price")
	public WebElement precio;
	@FindBy (xpath = "//*[@id=\"image_upload_button\"]/input")
	public WebElement foto;
	@FindBy (id= "region")
	public WebElement regPub;
	@FindBy (id= "communes")
	public WebElement comunPub;
	@FindBy (id= "p_ad")
	public WebElement persoPub;
	@FindBy (id= "name")
	public WebElement nombre;
	@FindBy (id= "email")
	public WebElement mail;
	@FindBy (id= "email_confirm")
	public WebElement mailV;
	@FindBy (id= "phone")
	public WebElement cel;
	@FindBy (id= "passwd")
	public WebElement pass;
	@FindBy (id= "passwd_ver")
	public WebElement passV;
	@FindBy (xpath = "//*[@id=\"aiform\"]/div[1]/div/ins")
	public WebElement term;
	@FindBy (id= "submit_create_now")
	public WebElement publicar;
	//By botonLocator = By.xpath("//*[@id=\"header\"]/div[2]/a");

	
	

	public boolean Categoria (String Categoria) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 3);
			wait.until(ExpectedConditions.elementToBeClickable(categ));
			Select selectcategoria = new Select(categ);
			selectcategoria.selectByVisibleText(Categoria);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean Nuevo (String Estado) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 3);
			wait.until(ExpectedConditions.elementToBeClickable(estado));
			Select selectNuevo = new Select(estado);
			selectNuevo.selectByVisibleText(Estado);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}	
	public boolean Genero (String Genero) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 3);
			wait.until(ExpectedConditions.elementToBeClickable(genero));
			Select selectGenero = new Select(genero);
			selectGenero.selectByVisibleText(Genero);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}	
	public boolean Talla (String Talla) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 3);
			wait.until(ExpectedConditions.elementToBeClickable(talla));
			Select selectTalla = new Select(talla);
			selectTalla.selectByVisibleText(Talla);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}	
	public boolean Titulo (String Titulo ) {
		try {
			titulo.sendKeys(Titulo);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean Descrip (String Desc) {
		try {
			desc.sendKeys(Desc);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}		
	public boolean Precio (String Precio) {
		try {
			precio.sendKeys(Precio);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}	
	public boolean Subida(String Subida) {
		try {
			foto.sendKeys(Subida);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	

public boolean Region (String Region) {
	try {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(regPub));
		Select selectregion = new Select(regPub);
		selectregion.selectByVisibleText(Region);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
}	
public boolean Comuna (String Comuna) {
	try {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(comunPub));
		Select selectregion = new Select(comunPub);
		selectregion.selectByVisibleText(Comuna);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
}	
public boolean Persona () {
	try {
		persoPub.click();
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
}

public boolean Nombre (String Nombre) {
	try {
		nombre.sendKeys(Nombre);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
}
public boolean Celu (String Celu) {
	try {
		cel.sendKeys(Celu);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
}

public boolean Mail (String Mail) {
	try {
		mail.sendKeys(Mail);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
}
public boolean MailVerf (String Mail) {
	try {
		mailV.sendKeys(Mail);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
}

public boolean Pass (String Pass) {
	try {
		pass.sendKeys(Pass);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
}
public boolean PassVerf (String Pass) {
	try {
		passV.sendKeys(Pass);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
}	
public boolean Terminos () {
	try {
		term.click();
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
}

public boolean PublicarBtn() {
	try {
		publicar.click();
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
}
public void selectpublicar() {
	driver.get("https://www2.yapo.cl/ai/form/0");
}	

	
	
}
