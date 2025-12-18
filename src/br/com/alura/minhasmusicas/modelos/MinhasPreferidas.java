package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo()+" é sucesso absoluto e fav de todos!");
        } else {
            System.out.println(audio.getTitulo()+" também é um dos que todo mundo está curtindo.");
        }
    }
}
