package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArquivoPDFTest {

    @Test
    void deveAbrirPDF() {
        IArquivo arquivo = ArquivoFactory.obterArquivo("PDF");
        assertEquals("PDF aberto", arquivo.abrir());
    }

    @Test
    void deveFecharPDF() {
        IArquivo arquivo = ArquivoFactory.obterArquivo("PDF");
        assertEquals("PDF fechado", arquivo.fechar());
    }
}