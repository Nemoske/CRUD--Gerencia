import java.util.Scanner;

public class Menu {
    public static void ExibirMenu() {
        Scanner scanf = new Scanner(System.in);
        while (true) {
            System.out.println("*******************************************************************");
            System.out.println("*                           SISTEMA                               *");
            System.out.println("*******************************************************************");
            System.out.println("*                                                                 *");
            System.out.println("*                        REGISTRAR-(1)                            *");
            System.out.println("*                           AGENDA-(2)                            *");
            System.out.println("*                        ATUALIZAR-(3)                            *");
            System.out.println("*                          DELETAR-(4)                            *");
            System.out.println("*                          RECEITA-(5)                            *");
            System.out.println("*                             SAIR-(6)                            *");
            System.out.println("*                                                                 *");
            System.out.println("*******************************************************************");

            int opcao = scanf.nextInt();

            if(opcao == 6){
                break;
            }
            switch (opcao){
                case 1:
                    Cliente.CadastrarCliente(scanf);
                    break;

                case 2:
                    Cliente.Agenda();
                    break;

                case 3:
                    Cliente.AtualizarAgenda(scanf);
                    break;

                case 4:
                    Cliente.RemoverCliente(scanf);
                    break;

                case 5:

                    System.out.printf("Receita total: R$ %.2f\n", Cliente.Receita());
                    break;
            }


        }
        scanf.close();
    }
}
