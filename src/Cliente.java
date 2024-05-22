
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    static int cdCliente;
    int idCliente;
    String nome;
    String data;
    String horario;
    String servico;
    double valor;

    public static ArrayList<Cliente> clientes= new ArrayList<>();

    public static void CadastrarCliente(Scanner scanf){
        cdCliente++;
        Cliente cliente = new Cliente();
        cliente.idCliente = cdCliente;
        System.out.println("NOME DA CLIENTE:");
        scanf.nextLine();
        cliente.nome = scanf.nextLine();
        System.out.println("DATA:");
        cliente.data = scanf.next();
        System.out.println("HORÁRIO:");
        cliente.horario = scanf.next();
        System.out.println("Serviço a ser realizado:");
        scanf.nextLine();
        cliente.servico = scanf.nextLine();
        System.out.println("VALOR:");
        cliente.valor = scanf.nextDouble();
        clientes.add(cliente);
    }

    public static void Agenda(){
        for(Cliente cliente : clientes){
            System.out.printf("ID: %d\n",cliente.idCliente);
            System.out.printf("NOME DA CLIENTE: %s\n",cliente.nome);
            System.out.printf("DATA: %s\n",cliente.data);
            System.out.printf("HORÁRIO: %s\n",cliente.horario);
            System.out.printf("Serviço: %s\n",cliente.servico);
            System.out.printf("Valor R$: %.2f\n",cliente.valor);

        }
    }

    public static void AtualizarAgenda(Scanner scanf){

        System.out.println("Digite o ID da cliente para editar:");
        int index = scanf.nextInt();
        Cliente cliente = clientes.get(index-1);
        System.out.println("Digite o novo nome da cliente: ");
        scanf.nextLine();
        cliente.nome = scanf.nextLine();
        System.out.println("Digite a DATA:");
        cliente.data = scanf.next();
        System.out.println("Digite o HORÁRIO:");
        cliente.horario = scanf.next();
        System.out.println("Serviço a ser realizado:");
        scanf.nextLine();
        cliente.servico = scanf.nextLine();
        System.out.println("Valor R$:");
        cliente.valor = scanf.nextDouble();
    }
    public static void RemoverCliente(Scanner scanf) {
        System.out.println("Digite o ID da cliente para remover:");
        int index = scanf.nextInt();
        clientes.remove(index - 1);
    }

    public static double Receita(){
        double total = 0;
        for (Cliente cliente : clientes){
            total += cliente.valor;
        }
        return total;
    }


}

















