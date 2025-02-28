package com.exercicio.calculadora;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    @Test
    public void deveSomarComSucesso() {
        int calc = Calculadora.soma(2, 3);
        assertEquals(5, calc);
    }

    @Test
    public void deveSubtrairComSucesso() {
        int calc = Calculadora.subtrai(3, 2);
        assertEquals(1, calc);
    }

    @Test
    public void dividirDividirComSucesso() {
        double calc = Calculadora.divide(3, 1);
        assertEquals(3, calc);
    }

    @Test
    public void deveMultiplicarComSucesso() {
        int calc = Calculadora.multiplica(2, 3);
        assertEquals(6, calc);
    }

    @Test
    public void deveLancarExcecaoQuandoDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculadora.divide(10, 0);
        }, "Deveria lançar ArithmeticException ao dividir por zero");
    }

    @Test
    public void deveExibirMensagemCorreta() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

            Calculadora.exibirResultado("soma", 15.0);

            String result = "O resultado da soma é: 15.0" + System.lineSeparator();
            assertEquals(result, output.toString());
    }
}
