package aula12.ex_sala_aula12.sigaa.salaaula.composite.tabela;

/**
 * Created by gilmario on 08/06/16.
 */
public class Celula {
    private String conteudo;
    public Celula(String conteudo) {
        this.conteudo = conteudo;
    }
    public void imprimir() {
        // Limita o conteúdo a exatamente 15 caracteres.
        conteudo = conteudo + "	";
        conteudo = conteudo.substring(0, 15);
        // Imprime na mesma linha e com borda lateral.
        System.out.print(" | " + conteudo);
    }
}
