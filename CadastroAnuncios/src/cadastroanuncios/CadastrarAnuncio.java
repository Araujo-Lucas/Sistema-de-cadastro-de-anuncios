
package cadastroanuncios;

import java.util.ArrayList;

/**
 @author lucas
 */
public class CadastrarAnuncio {
    //Atributos
    private String nomeAnuncio;
    private String cliente;
    private float investimentoDiario;
    
    //Construtor
    public CadastrarAnuncio(String nomeAnuncio, String cliente, float investimentoDiario) 
    {
        this.nomeAnuncio = nomeAnuncio;
        this.cliente = cliente;
        this.investimentoDiario = investimentoDiario;
    }
    
    public String getInfoAnuncio()
    {
        return "Nome do anúncio: " + nomeAnuncio + "\n" + "Cliente: " + cliente + "\n" + "Investimento diário: R$ " + investimentoDiario;
    } 
}
