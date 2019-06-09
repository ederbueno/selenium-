package br.com.americanas.telas;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelaCadastro {

	private WebDriver elemento;
	private WebElement elementoWeb;

	// TextField
	public void digitarEmail(String email) {
		elementoWeb = elemento.findElement(By.id("email-input"));
		elementoWeb.getAttribute(email);
	}

	public void digitarSenha(String senha) {
		elementoWeb = elemento.findElement(By.id("password-input"));
		elementoWeb.getAttribute(senha);
	}

	public void digitarCpf(String cpf) {
		elementoWeb = elemento.findElement(By.id("cpf-input"));
		elementoWeb.getAttribute(cpf);
	}

	public void digitarName(String name) {
		elementoWeb = elemento.findElement(By.id("name-input"));
		elementoWeb.getAttribute(name);
	}

	public void digitarDataNascimento(String data) {
		elementoWeb = elemento.findElement(By.id("birthday"));
		elementoWeb.getAttribute(data);
	}
	
	public void digitarTelefone(String telefone) {
		elementoWeb = elemento.findElement(By.id("phone"));
		elementoWeb.getAttribute(telefone);
	}

	// RadioButton
	public void clicarRadioButtonMasculinoFeminino(String flag) {

		if (flag.equals("M")) {
			elementoWeb = elemento.findElement(By.id("gender_M"));
			elementoWeb.click();
		} else {
			elementoWeb = elemento.findElement(By.id("gender_F"));
			elementoWeb.click();
		}

	}
	
	//button
	public void clicarBotaoCriarSeuCadastro() {
		elementoWeb = elemento.findElement(By.id("btn btn-primary submit-button  cadastroForm-submit"));
		elementoWeb.click();		
	}
	
	//Metodo Validar Texto
	public void validarTexto(String texto, String id) {
		elementoWeb = elemento.findElement(By.id(id));
		assertTrue(elementoWeb.getText().equals(texto));		
	}


}
