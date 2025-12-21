package edu.marcos.semana03.exame.service;
import edu.marcos.semana03.exame.model.Documentos;

public class DocumentoService {

    public boolean documentosValidos(Documentos doc){
        return doc.hasRg() && doc.hasCpf();
    }

}
