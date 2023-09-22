public class OperadoresTernario {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        String resultado = "";

        if (a==b){
            resultado = "Verdadeiro";
        }else{
            resultado = "falso";
        }

        System.out.println(resultado);

        //utilizando o operador ternáiro
        //economizou duas linhas
        int c = 3;
        int d = 1;
        String resultado2 = c==d ?"veradeiro" : "falso";
        System.out.println(resultado2);
    }
}
