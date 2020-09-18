package IMC;

import IMC.Pessoa;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class PessoaTest {

    public Pessoa pessoa = new Pessoa(80, 1.80F);

    @Rule
    public ErrorCollector error = new ErrorCollector();

    @org.junit.Test
    public void testCalcularImc() {
        error.checkThat(Math.round(pessoa.calcularImc() * 100.0) / 100.0, is(24.69));
    }

    @org.junit.Test
    public void testCalcularPesoIdeal() {
        error.checkThat(Math.round(pessoa.calcularPesoIdeal("Min") * 100.0) / 100.0, is(59.94));
        error.checkThat(Math.round(pessoa.calcularPesoIdeal("Med") * 100.0) / 100.0, is(70.47));
        error.checkThat(Math.round(pessoa.calcularPesoIdeal("Max") * 100.0) / 100.0, is(81.00));
    }
}