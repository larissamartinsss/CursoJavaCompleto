package br.com.introduçãojava.controlefluxo;

public class ControleFluxo1 {
    public static void main(String[] args) {
        // idade < 15 categoria infantial
        // idade >= 15 && idade < 18 juvenil
        // idade >= 18 adulto
        int idade = 17;
        String categoria;
        float salario = 4000;
        boolean c = false;

        if (idade < 15) {
           categoria = "infantil";
        }else if (idade >= 15 && idade < 18){
            categoria = "categoria juvenil";
        }else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
