package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args){
       selecaoCandidatos();

    }

    static void selecaoCandidatos(){

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0; //Felipe é o indice 0
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){ // essa linha se lê: eu tenho meus candidatos selecionados, só posso selecionar 5 mas eu só posso selecionar enquanto tiver pessoas para eu buscar na minha lista de candidaturas
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++; //a proxima chamada vai ser dos proximos candidatos, começou com o Felipe, depois pra marcia, julia, etc
        }
    }
    static double valorPretendido() {  //metódo que simula o valor pretendido para cada candidato aleatoriamente
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
}

    static void analisarCandidato(double salarioPretendido){ //double salarioPretendido é o parametro do metodo criado
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
        }
    }

    /*
     
    Vamos explorar alguns outros cenários, com fluxo condicionais, repetições e excepcionais.

Case 1: Vamos imaginar que em um processo seletivo, existe o valor base salarial de R$ 2.000,00 e o salário pretentido pelo candidato. Vamos elaborar um controle de fluxo onde:

Se o valor salário base, for maior que valor salário pretentido, imprima : LIGAR PARA O CANDIDATO;

Senão, Se o valor salário base for igual ao valor salário pretentido, imprima : LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;

Senão imprima: AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.

Case 2: Foi solicitado, que nosso sistema garanta que, diante das inúmeras candidaturas sejam selecionados apenas no máximo, 5 candidatos para entrevista, onde o salário pretendido seja menor ou igual ao salário base.

Copy
// Array com a lista de candidatos

String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
Copy
// Método que simula o valor pretendido

import java.util.concurrent.ThreadLocalRandom;
static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
}
Case 3: Agora é hora de imprimir a lista dos candidatos selecionados, para disponibilizar para o RH entrar em contato.

Case 4: O RH deverá realizar uma ligação, com no máximo 03 tentativas para cada candidato selecionado e caso o candidato atenda, deve-se imprimir:

"CONSEGUIMOS CONTATO COM _
[CANDIDATO]
 ``` APÓS **_**
[TENTATIVA]`** TENTATIVA(S)" ;**

Do contrário imprima: "NÃO CONSEGUIMOS CONTATO COM O _
[CANDIDATO]
_".


     */