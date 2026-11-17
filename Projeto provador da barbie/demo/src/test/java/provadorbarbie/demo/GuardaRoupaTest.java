
package provadorbarbie.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuardaRoupaTest {

    private GuardaRoupa guardaRoupa;

    @BeforeEach
    void configurar() {
        guardaRoupa = new GuardaRoupa(500.00);
    }

    // testes sobre calculos

    @Test
    void deveCalcularDescontoCorretamente() {
        double resultado = guardaRoupa.precoComDesconto(200, 10);

        assertEquals(180.00, resultado, 0.001);
    }

    @Test
    void deveLancarExcecaoParaDescontoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            guardaRoupa.precoComDesconto(200, -10);
        });
    }

    @Test
    void deveLancarExcecaoParaDescontoAcimaDe100() {
        assertThrows(IllegalArgumentException.class, () -> {
            guardaRoupa.precoComDesconto(200, 150);
        });
    }

    // testes sobre orcamento

    @Test
    void deveAceitarPrecoAbaixoDoOrcamento() {
        assertTrue(guardaRoupa.cabeNoOrcamento(400));
    }

    @Test
    void deveAceitarPrecoIgualAoOrcamento() {
        assertTrue(guardaRoupa.cabeNoOrcamento(500));
    }

    // testes sobre gala

    @Test
    void naoDeveSerGalaAbaixoDe200() {
        assertFalse(guardaRoupa.ehDeGala(199));
    }

    @Test
    void naoDeveSerGalaExatamenteEm200() {
        assertFalse(guardaRoupa.ehDeGala(200));
    }

    @Test
    void deveSerGalaAcimaDe200() {
        assertTrue(guardaRoupa.ehDeGala(201));
    }
}
