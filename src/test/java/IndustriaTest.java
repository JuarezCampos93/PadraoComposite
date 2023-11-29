import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




class IndustriaTest {

    @Test
    void deveRetonarRelatorio(){
        Identificacao id1 = new Identificacao("Id1");

        Identificacao id2 = new Identificacao("Id2");
        Categoria categoria1 = new Categoria("Manufatura", "Peca");
        id2.adiconaRelatorio(categoria1);

        Identificacao endTag = new Identificacao("Todas as ids");
        endTag.adiconaRelatorio(id1);
        endTag.adiconaRelatorio(id2);

        Industria ind= new Industria();
        ind.setRelatorio(endTag);

        assertEquals("Id: Todas as ids\n" + "Id: Id1\n" + "Id: Id2\n" + "Categoria: Peca- Descrição: Manufatura\n", ind.getRelatorio());
    }
    @Test
    void deveRetonarExcecaoEmpresa(){
        try{
            Industria ind= new Industria();
            ind.getRelatorio();
            fail();
        }catch (NullPointerException e){
            assertEquals("Relatório não encontrado", e.getMessage());
        }
    }

}