package padroescriacao.factorymethod;

public class ArquivoFactory {

    public static IArquivo obterArquivo(String tipo) {
        Class classe = null;
        Object objeto = null;
        try {

            classe = Class.forName("padroescriacao.factorymethod.Arquivo" + tipo);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Arquivo inexistente");
        }
        if (!(objeto instanceof IArquivo)) {
            throw new IllegalArgumentException("Arquivo inválido");
        }
        return (IArquivo) objeto;
    }
}