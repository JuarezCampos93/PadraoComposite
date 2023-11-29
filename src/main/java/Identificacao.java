import java.util.ArrayList;
import java.util.List;

public class Identificacao extends Relatorio {
    private List<Relatorio> relatorios;

    public Identificacao(String descricao) {
        super(descricao);
        this.relatorios = new ArrayList<Relatorio>();
    }

    public void adiconaRelatorio(Relatorio relatorio) {
        this.relatorios.add(relatorio);
    }

    public String getRelatorio() {
        String end = "";
        end = "Id: " + this.getDescricao() + "\n";
        for (Relatorio relatorio : relatorios) {
            end += relatorio.getRelatorio();
        }
        return end;
    }
}