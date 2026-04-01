package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArquivoDOCXTest {

    @Test
    void deveAbrirDOCX() {
        IArquivo arquivo = ArquivoFactory.obterArquivo("DOCX");
        assertEquals("DOCX aberto", arquivo.abrir());
    }

    @Test
    void deveFecharDOCX() {
        IArquivo arquivo = ArquivoFactory.obterArquivo("DOCX");
        assertEquals("DOCX fechado", arquivo.fechar());
    }
}