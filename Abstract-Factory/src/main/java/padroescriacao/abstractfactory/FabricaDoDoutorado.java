package padroescriacao.abstractfactory;

public class FabricaDoDoutorado implements FabricaAbstrata {

    @Override
    public Diploma createDiploma() {
        return new DiplomaDoDoutorado();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoDoDoutorado();
    }
}
