public class SerieHarmonica {

    // Construtor padrão
    public SerieHarmonica() {
        // Utilizado apenas para criar a instância
    }

    // Método recursivo que calcula: 1 + 1/2 + 1/3 + ... + 1/N
    public double calcularSomatoria(int valor) {

        /*
         * CASO BASE:
         * Se valor for igual a 1,
         * o retorno é 1.
         */
        if (valor == 1) {
            return 1.0;
        }

        /*
         * PASSO RECURSIVO:
         * S(valor) = 1/valor + S(valor - 1)
         */
        return (1 / (double) valor) + calcularSomatoria(valor - 1);
    }
}