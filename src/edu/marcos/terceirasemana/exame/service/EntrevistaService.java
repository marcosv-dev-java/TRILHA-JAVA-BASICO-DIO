package edu.marcos.terceirasemana.exame.service;
import edu.marcos.terceirasemana.exame.model.Documentos;
import edu.marcos.terceirasemana.exame.model.Exame;
import edu.marcos.terceirasemana.exame.model.Resultado;

public class EntrevistaService {
    private DocumentoService documentoService = new DocumentoService();
    private ExameService exameService = new ExameService();

    public Resultado processar(Documentos docs, Exame exame){
        Resultado resultado = new Resultado();

    if (!documentoService.documentosValidos(docs)){
        resultado.setAprovado(false);
        resultado.setMensagem("Documentos inválidos!");
        return resultado;
    }
    if (!exameService.exameAprovado(exame)){
        resultado.setAprovado(false);
        resultado.setMensagem("Vacinas incompletas");
        return resultado;
    }
    resultado.setAprovado(true);
    resultado.setMensagem("Candidato aprovado");
    return resultado;

}
}
