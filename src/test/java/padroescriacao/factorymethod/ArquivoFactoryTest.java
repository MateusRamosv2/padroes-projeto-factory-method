package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArquivoFactoryTest {

    @Test
    void deveRetornarExcecaoParaArquivoInexistente() {
        try {
            IArquivo arquivo = ArquivoFactory.obterArquivo("CSV");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Arquivo inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaArquivoInvalido() {
        try {
            // ArquivoTexto existe, mas não implementa IArquivo
            IArquivo arquivo = ArquivoFactory.obterArquivo("Texto");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Arquivo inválido", e.getMessage());
        }
    }
}