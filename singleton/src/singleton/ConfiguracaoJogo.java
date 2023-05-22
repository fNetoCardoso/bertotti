package singleton;

public class ConfiguracaoJogo {
    private static ConfiguracaoJogo instancia;
    private int volume;
    private String idioma;

    private ConfiguracaoJogo() {
        // Configurações padrão
        volume = 50;
        idioma = "Português";
    }

    public static ConfiguracaoJogo getInstance() {
        if (instancia == null) {
            synchronized (ConfiguracaoJogo.class) {
                if (instancia == null) {
                    instancia = new ConfiguracaoJogo();
                }
            }
        }
        return instancia;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public static void main(String[] args) {
        ConfiguracaoJogo configuracao = ConfiguracaoJogo.getInstance();
        System.out.println("Volume: " + configuracao.getVolume());
        System.out.println("Idioma: " + configuracao.getIdioma());

        configuracao.setVolume(80);
        configuracao.setIdioma("Inglês");

        System.out.println("Volume atualizado: " + configuracao.getVolume());
        System.out.println("Idioma atualizado: " + configuracao.getIdioma());
    }
}
