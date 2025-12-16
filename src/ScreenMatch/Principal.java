package ScreenMatch;
import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Avatar");
        meuFilme.setAnoLancamento(2009);
        meuFilme.setDuracaoMinutos(162);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(2);
        meuFilme.avalia(10);
    }
}
