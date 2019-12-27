package br.com.relatorio.server;

import br.com.relatorio.model.Relatorio;
import br.com.relatorio.model.retorno.RespRelatorio;
import br.com.relatorio.model.retorno.Retorno;
import com.google.gson.Gson;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/relatorios")
public class RelatorioProducer {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Retorno doPost(Relatorio relatorio) {
        Gson gson = new Gson();
        System.out.println("---------------------- Parametro ----------------------");
        System.out.println("json: " + gson.toJson(relatorio));
        System.out.println("---------------------- FIM ----------------------");
        return new RespRelatorio();
    }
}
