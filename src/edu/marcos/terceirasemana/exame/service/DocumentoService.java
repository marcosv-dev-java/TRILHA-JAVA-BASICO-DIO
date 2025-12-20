package edu.marcos.terceirasemana.exame.service;
import edu.marcos.terceirasemana.exame.model.Documentos;

public class DocumentoService {

    public boolean documentosValidos(Documentos doc){
        return doc.hasRg() && doc.hasCpf();
    }

}
