
package cadastroanuncios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 @author lucas
 */
public class AnunciosMain 
{
    public static void main(String[] args) 
    { 
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("Digite a quantidade de anúncios que deseja cadastrar: ");
        int numAnuncios = entrada.nextInt();
        
        for(int i=1; i<=numAnuncios; i++)
        {
            System.out.println("Digite o nome do anúncio");
            String nomeAnuncio = entrada.next();

            System.out.println("Digite o nome do cliente");
            String cliente = entrada.next();

            System.out.println("Digite o Investimento diário em R$");
            float investimentoDiario = entrada.nextFloat();
       
            CadastrarAnuncio anuncio = new CadastrarAnuncio(nomeAnuncio, cliente, investimentoDiario);

            SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");

            System.out.println("Digite o dia de início: ");
            int diaInicio = entrada.nextInt();
            System.out.println("Digite o mês de início: ");
            int mesInicio = entrada.nextInt();
            System.out.println("Digite o ano de início: ");
            int anoInicio = entrada.nextInt();
            Calendar dataInicio = new GregorianCalendar(anoInicio, mesInicio-1, diaInicio);

            System.out.println("Digite o dia de término: ");
            int diaTermino = entrada.nextInt();
            System.out.println("Digite o mês de término: ");
            int mesTermino = entrada.nextInt();
            System.out.println("Digite o ano de término: ");
            int anoTermino = entrada.nextInt();
            Calendar dataFinal = new GregorianCalendar(anoTermino, mesTermino-1, diaTermino);

            System.out.println(" \n --Dados do anúncio-- \n" + anuncio.getInfoAnuncio());
            System.out.println("Data de início: " + sdf.format(dataInicio.getTime()));
            System.out.println("Data de término: " + sdf.format(dataFinal.getTime()));
            
            int opcao = 0;
            while(opcao != 5)
            {
                System.out.println(" \n --Digite o número do Relatório que deseja emitir-- \n"
                        + "1) Valor total investido \n"
                        + "2) Quantidade máxima de cliques \n"
                        + "3) Quantidade máxima de compartilhamentos \n"
                        + "4) Quantidade máxima de visualizações \n"
                        + "5) Sair");
                opcao = entrada.nextInt();
                if(opcao == 1)
                {
                    System.out.println("Investimento total investido: " + investimentoDiario);
                }
                else if (opcao == 2)
                {
                    float visualizacoes = investimentoDiario * 30.0f;
                    float cliques = visualizacoes * 0.12f;
                    System.out.println("Quantidade máxima de cliques: " + cliques);
                }
                else if (opcao == 3)
                {
                    float visualizacoes = investimentoDiario * 30.0f;
                    float cliques = visualizacoes * 0.12f;
                    float compartilhamentos = cliques/(20/3f);
                    System.out.println("Quantidade máxima de compartilhamentos: " + compartilhamentos);
                }
                else if(opcao == 4)
                {
                    float visualizacoes = investimentoDiario * 30.0f;
                    float cliques = visualizacoes * 0.12f;
                    float compartilhamentos = cliques/(20/3f);
                    float visualizacoes_compartilhamento = compartilhamentos * 40.0f;
                    float visualizacoes_max = visualizacoes + visualizacoes_compartilhamento;
                    System.out.println("Quantidade máxima de visualizações: " + visualizacoes_max);
                }
            }
        }
    } 
}
