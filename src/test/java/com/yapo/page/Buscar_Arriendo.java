package com.yapo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.yapo.config.BaseConfig;

public class Buscar_Arriendo extends BaseConfig {
	public Buscar_Arriendo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "searcharea_expanded")
	public WebElement RM;
	@FindBy(id="searchtext")
	private WebElement texto;
	@FindBy(id = "multicom-head")
	private WebElement comuna;
	@FindBy(xpath = "//*[@id=\"multicom-widget\"]/label[50]/div") 
	private WebElement check;
	@FindBy(id = "catgroup")
	private WebElement categoria;
	@FindBy(id= "estate_type_ret")
	private WebElement tipo;
	@FindBy(id="ps_2")
	private WebElement minimP;
	@FindBy(id="pe_2")
	private WebElement maxP;
	@FindBy(id="rooms_ros")
	private WebElement minimD;
	@FindBy(id="rooms_roe")
	private WebElement maxD;
	@FindBy(id="ss_0")
	private WebElement minMt2;
	@FindBy(id="se_0")
	private WebElement maxMt2;	
	@FindBy(id="bathrooms_brs")
	private WebElement minB;
	@FindBy(id="bathrooms_bre")
	private WebElement maxB;
	@FindBy(id="condominio_cos")
	private WebElement minGc;
	@FindBy(id="condominio_coe")
	private WebElement maxGc;
	@FindBy(id="garage_spaces_gs")
	private WebElement est;
	@FindBy(id="searchbutton")
	private WebElement buscar;
	
/*----------------------------------------------------------*/
	
	public boolean clickRegion(String Region) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(RM));
			Select selectRegion = new Select(RM);
			selectRegion.selectByVisibleText(Region);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean texto(String Texto) {
		try {
		texto.sendKeys(Texto);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
}
	public boolean clickComuna () {
		try {
			comuna.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean clickCheck () {
		try {
			check.click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean clickCategoria(String Categoria) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 3);
			wait.until(ExpectedConditions.elementToBeClickable(categoria));
			System.out.println("Seleccionando categoria");
			Select selectCategoria = new Select(categoria);
			selectCategoria.selectByVisibleText(Categoria);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean tipoPropiedad(String Tipo) {
		try {
			System.out.println("Seleccionando tipo de inmueble");
			Select selectTipoInmueble = new Select(tipo);
			selectTipoInmueble.selectByVisibleText(Tipo);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean preMin(String MinimP) {
		try {
			Select selectMinPrecio = new Select(minimP);
			selectMinPrecio.selectByVisibleText(MinimP);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean preMax(String MaxP) {
		try {
			Select selectMaxPrecio = new Select(maxP);
			selectMaxPrecio.selectByVisibleText(MaxP);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean SelectdorMin(String MinimD) {
		try {
			Select selectMinDor = new Select(minimD);
			selectMinDor.selectByVisibleText(MinimD);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean SelectdorMax(String MaxD) {
		try {
			Select selectMaxDor = new Select(maxD);
			selectMaxDor.selectByVisibleText(MaxD);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}	
	
	public boolean Selectm2Min(String MinMts2) {
		try {
			Select selectm2min = new Select(minMt2);
			selectm2min.selectByVisibleText(MinMts2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean Selectm2Max(String MaxMt2) {
		try {
			Select selectm2max = new Select(maxMt2);
			selectm2max.selectByVisibleText(MaxMt2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}	

	public boolean SelectbanoMin(String MinB) {
		try {
			Select selectbanoMin = new Select(minB);
			selectbanoMin.selectByVisibleText(MinB);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean SelectbanoMax(String MaxB) {
		try {
			Select selectbanoMax = new Select(maxB);
			selectbanoMax.selectByVisibleText(MaxB);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean SelectGastoMin(String MinGc) {
		try {
			Select selectGastoMin = new Select(minGc);
			selectGastoMin.selectByVisibleText(MinGc);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean SelectGastoMax(String MaxGc) {
		try {
			Select selectGastoMax = new Select(maxGc);
			selectGastoMax.selectByVisibleText(MaxGc);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}	
	
	public boolean SelectParking(String Est) {
		try {
			Select selectestacionamiento = new Select(est);
			selectestacionamiento.selectByVisibleText(Est);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}	
	
	public void pressSearch() {
		buscar.click();
	}
	
	public void selectMetropolitana() {
		driver.get("https://www.yapo.cl/region_metropolitana");
	}
	
}