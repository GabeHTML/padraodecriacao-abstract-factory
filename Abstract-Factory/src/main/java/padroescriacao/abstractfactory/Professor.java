package padroescriacao.abstractfactory;

public class Professor {

    private Diploma diploma;
    private Historico historico;

    public Professor (FabricaAbstrata fabrica) {
        this.diploma = fabrica.createDiploma();
        this.historico = fabrica.createHistorico();
    }

    public String emitirDiploma() {
        return this.diploma.emitir();
    }

    public String emitirHistorico() {
        return this.historico.emitir();
    }
}
