package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArquivoXLSXTest {

    @Test
    void deveAbrirXLSX() {
        IArquivo arquivo = ArquivoFactory.obterArquivo("XLSX");
        assertEquals("XLSX aberto", arquivo.abrir());
    }

    @Test
    void deveFecharXLSX() {
        IArquivo arquivo = ArquivoFactory.obterArquivo("XLSX");
        assertEquals("XLSX fechado", arquivo.fechar());
    }
}