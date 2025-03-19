
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2.5;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //short numeroCurto2 = numeroNormal; // não vai deixar
        short numeroCurto2 = (short) numeroNormal; // forçando "casting"
       //adicionar um novo objeto a classe Date dataNacimento = new Date();
        char sexo = 'M';
        final double VALOR_DE_PI = 3.14; // final e caixa alta está indicando que não vai mudar o valor.
    }
}
