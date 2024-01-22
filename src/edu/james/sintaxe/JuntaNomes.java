package edu.james.sintaxe;

public class JuntaNomes {

    public static void main(String [] args){
        String Nome = "Robertin";
        String Vulgo =  "Do Gelo";
        System.out.println(concaNome(Nome,Vulgo));
    }

    public static String concaNome(String pNome, String sNome){
        return pNome.concat(" ").concat(sNome);
    }
}
