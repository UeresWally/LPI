package E2;

import E2.model.AlunoFatecSJC;
import E2.model.Calcado;
import E2.model.InstrumentoMusical;
import E2.model.Lugar;
import E2.model.Pessoa;
import E2.model.Profissional;

public class Teste {
    public static void main(String[] args) {
        Object[] array = new Object[30];
        
        int i = 0;
        for (; i < 5; ++i) {
            array[i] = new AlunoFatecSJC();
        }
        for (; i < 10; ++i) {
            array[i] = new Calcado();
        }
        for (; i < 15; ++i) {
            array[i] = new InstrumentoMusical();
        }
        for (; i < 20; ++i) {
            array[i] = new Lugar();
        }
        for (; i < 25; ++i) {
            array[i] = new Pessoa();
        }
        for (; i < 30; ++i) {
            array[i] = new Profissional();
        }

        for (i = 0; i < array.length; ++i) {
            System.out.println(array[i].toString());
        }
    }
}
