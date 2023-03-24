package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveEmitirHistoricoMestrado() {
        FabricaAbstrata fabrica = new FabricaDoMestrado();
        Professor professor = new Professor(fabrica);
        assertEquals("Histórico de Mestrado", professor.emitirHistorico());
    }

    @Test
    void deveEmitirHistoricoDoutorado() {
        FabricaAbstrata fabrica = new FabricaDoDoutorado();
        Professor professor = new Professor(fabrica);
        assertEquals("Histórico de Doutorado", professor.emitirHistorico());
    }

    @Test
    void deveEmitirDiplomaMestrado() {
        FabricaAbstrata fabrica = new FabricaDoMestrado();
        Professor professor = new Professor(fabrica);
        assertEquals("Diploma de Mestrado", professor.emitirDiploma());
    }

    @Test
    void deveEmitirDiplomaDoutorado() {
        FabricaAbstrata fabrica = new FabricaDoDoutorado();
        Professor professor = new Professor(fabrica);
        assertEquals("Diploma de Doutorado", professor.emitirDiploma());
    }

}