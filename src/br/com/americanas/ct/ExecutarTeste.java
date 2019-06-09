package br.com.americanas.ct;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.americanas.contexto.ContextoAmericanas;
import br.com.americanas.funcao.FuncaoAmericanas;
import br.com.americanas.telas.TelaInicial;

public class ExecutarTeste {

	
	@Before
	public void iniciar() {		
	
		FuncaoAmericanas.abrirBrowser(ContextoAmericanas.URLAMERICANAS);
		
	}	
	
	@Test
	public void test() throws InterruptedException {
		
		TelaInicial inicial = new TelaInicial();
		inicial.arrastarMouseLinkCadastraSe();
	 
	
	}
	
	@After
	public void fim() {
		 FuncaoAmericanas.fecharBrowser();
	}

}
