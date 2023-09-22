public class Strings {
    public static void main(String[] args) {
        //Criação de uma instância da classe String
        String texto = "Qualquer texto entre aspas é uma String";
        // Declaração de uma string utilizando o operador new
        String texto1 = new String("Qualquer texto entre aspas é uma String");
        //Toda a vez que o código acima for executado uma nova String será criada contendo o texto "Qualquer texto entre aspas é uma String".
        "Qualquer texto entre aspas é uma String".length();
        //Note acima que o texto não foi atribuído a nenhuma variável, mas ainda assim é um objeto plenamente funcional para o compilador, a partir do qual podemos invocar quaisquer métodos da classe String.

        String texto3;
        //erro de compilação variaveis locais não poder ser imprimidas se n for inicialiada
        //Igualdade entre Strings
        //metodos de strings
        // equals() verifica se duas Strings contém exatamente os mesmos caracteres.

        String nome =  new String();
        String apelido = "Arthur";
        if(nome == apelido) {
            System.out.println("Nome e apelido são Iguais");
        }

        // concatenaçaõ 
        String concatena = 1+"1"+1+1;
        //verificou que o segundo valor era um texto e fez concatenação
        System.out.println(concatena);
        concatena = "1" + 2 + 3;
        System.out.println(concatena);
        concatena = "1" + (2 + 3);
        System.out.println(concatena);
       
    }
    
}
