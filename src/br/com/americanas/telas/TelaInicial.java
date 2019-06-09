package br.com.americanas.telas;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TelaInicial {
	
	private WebDriver elemento;
	private WebElement elementoWeb;
	private Select comboBox;
	
	//MouseOver	
	public void arrastarMouseLinkCadastraSe() throws InterruptedException {
		
		
	    		
		 elemento.findElement(By.className("h_usr-link")).click();
	
		
	}
	
	//Link
	public void clicarLinkClienteNovoCadastrar() {
		elementoWeb = elemento.findElement(By.className("usr-signup"));
		elementoWeb.click();
	}
	
	//TextField
	public void digitarBusca(String busca) {
		elementoWeb = elemento.findElement(By.id("h_search-input"));
		elementoWeb.getAttribute(busca);
		
	}
	
	//Button
	public void clicarBotaoBuscar() {
		elementoWeb = elemento.findElement(By.id("h_search-btn"));
		elementoWeb.click();
		
	}
	
	public void clicarCelular() {
		elementoWeb = elemento.findElement(By.className("Wrapper-sc-1m3ayw0-0 kyhpfZ TouchableA-sc-9v9alh-0 erDjqc"));
		elementoWeb.click();
	}
	
	
	
	public void clicarComprar() {
		elementoWeb = elemento.findElement(By.id("btn-buy"));
		elementoWeb.click();
	}
	

	public void clicarContinuar() {
		elementoWeb = elemento.findElement(By.id("btn-continue"));
		elementoWeb.click();
	}
	
	public void clicarContinuarComprar() {
		elementoWeb = elemento.findElement(By.id("buy-button"));
		elementoWeb.click();
	}
	
	
	public void selecionarComboBoxQuantidade() {
		elementoWeb = elemento.findElement(By.className("form-control select__quantity"));
		comboBox = new Select(elementoWeb);
		comboBox.selectByValue("2");
	}
	
	//summary-total -> class Name
	//summary-totalInstallments -> class name
	public void validarTexto(String texto, String id) {
		elementoWeb = elemento.findElement(By.id(id));
		assertTrue(elementoWeb.getText().equals(texto));		
	}
	
	
	
	

	
	
	
	

}
