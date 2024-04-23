package com.Singleton;
import java.util.ArrayList;

public class Fila {

private static Fila instancia;
    
    private ArrayList<String> filaDeImpressao;

    private Fila() {
        filaDeImpressao = new ArrayList<>();
    }

    public static Fila getInstancia() {
        if (instancia == null) {
            // Inicialização preguiçosa (lazy initialization)
            instancia = new Fila();
        }
        return instancia;
    }

    public void ImprimeDocumento(String documento) {
        filaDeImpressao.add(documento);
        System.out.println("Documento adicionado à fila de impressão: " + documento);
    }

    public void RemoveDocumento() {
        if (!filaDeImpressao.isEmpty()) {
            String documentoRemovido = filaDeImpressao.remove(0);
            System.out.println("Documento removido da fila de impressão: " + documentoRemovido);
        } else {
            System.out.println("A fila de impressão está vazia.");
        }
    }

    public void RemoverTodosDocumentos() {
        filaDeImpressao.clear();
        System.out.println("Todos os documentos foram removidos da fila de impressão.");
    }
}
