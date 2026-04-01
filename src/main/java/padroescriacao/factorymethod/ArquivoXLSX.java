package padroescriacao.factorymethod;

public class ArquivoXLSX implements IArquivo {
    public String abrir() { return "XLSX aberto"; }
    public String fechar() { return "XLSX fechado"; }
}