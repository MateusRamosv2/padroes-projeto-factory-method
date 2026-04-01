package padroescriacao.factorymethod;

public class ArquivoDOCX implements IArquivo {
    public String abrir() { return "DOCX aberto"; }
    public String fechar() { return "DOCX fechado"; }
}