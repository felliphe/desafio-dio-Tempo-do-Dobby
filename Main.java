//Complete os espaços em branco com o seu código
import java.util.Scanner;
import static java.lang.System.out;

public class Main {


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();

      switch(a){
        case 61:
          out.println("Brasilia");
          break;
        case 71:
          out.println("Salvador");
          break;
        case 11:
          out.println("Sao Paulo");
          break;
        case 21:
          out.println("Rio de Janeiro");
          break;
        case 32:
          out.println("Juiz de Fora");
          break;
        case 19:
          out.println("Campinas");
          break;
        case 27:
          out.println("Vitoria");
          break;
        case 31:
           out.println("Belo Horizonte");
           break;
          default:
              out.println("DDD nao cadastrado");

      }
   }

}
