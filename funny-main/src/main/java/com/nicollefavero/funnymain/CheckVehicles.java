package com.nicollefavero.funnymain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckVehicles {

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+](\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,}$)";

    public static boolean isValidEmail(final String emailToValidate){
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(emailToValidate);
        return matcher.matches();
    }

    public static void main(String[] args) {
        boolean i10 = false, iext = false;
        String emailTarget = "";

        //Ler todos os args passados pela linha de comando
        for (String arg : args) {

            //Evitar case sensitive e espaços em branco ao redor da string
            arg = arg.toUpperCase().trim();

            //Verificar os argumentos passados
            if(arg.equals("I10")){
                System.out.println("Ignorando carros com mais de 10 anos.");
                i10 = true;

            } else if(arg.equals("IEXT")){
                System.out.println("Ignorando carros que estão fora da empresa.");
                iext = true;

            } else if(arg.contains("EMAIL:")){
                String[] argEmail = arg.split(":");
                String email = argEmail[1];

                if(isValidEmail(email)){
                    emailTarget = email.toLowerCase().trim();
                } else {
                    System.out.println(email + "é um email inválido. Encerrando...");
                    return;
                }

            } else {
                System.out.println("O argumento '" + arg + "' não existe. Encerrando...");
                return;
            }
        }

        System.out.println("I10: " + i10);
        System.out.println("IEXT: " + iext);

        if(!emailTarget.isEmpty()){
            System.out.println("Relatório enviado com sucesso para " + emailTarget);
        } else {
            System.out.println("Não foi possível enviar o relatório.");
        }
    }
}
