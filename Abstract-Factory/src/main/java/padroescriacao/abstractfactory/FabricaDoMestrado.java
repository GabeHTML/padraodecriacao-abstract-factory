package padroescriacao.abstractfactory;

public class FabricaDoMestrado implements FabricaAbstrata {

    @Override
    public Diploma createDiploma() {
        return new DiplomaDoMestrado();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoDoMestrado();
    }
}
