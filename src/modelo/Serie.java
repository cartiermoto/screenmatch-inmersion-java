package modelo;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporadas;
    private int duraccionnPorEpisodios;

    public int getTemporadas() {
        return temporadas;
    }

    @Override
    public int getTiempoDeDuracionEnMinutos() {
        return duraccionnPorEpisodios * episodiosPorTemporadas* temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public int getDuraccionnPorEpisodios() {
        return duraccionnPorEpisodios;
    }

    public void setDuraccionnPorEpisodios(int duraccionnPorEpisodios) {
        this.duraccionnPorEpisodios = duraccionnPorEpisodios;
    }
}
