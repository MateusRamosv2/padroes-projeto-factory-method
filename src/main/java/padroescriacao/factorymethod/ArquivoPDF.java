package padroescriacao.factorymethod;

public class ArquivoPDF implements IArquivo {
    public String abrir() { return "PDF aberto"; }
    public String fechar() { return "PDF fechado"; }
}