package com.validator;

import java.util.Scanner;
import com.validator.CnpjValidator;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String CNPJ;

        System.out.printf("Inform a CNPJ: ");
        // using regex to remove all non-numbers from input
        CNPJ = sc.next().replaceAll("[^x0-9]", "");
        System.out.printf("\nResult: ");
        // using the isCNPJ() and writeCNPJ() methods of the "CnpjValidator" class
        if (CnpjValidator.isCNPJ(CNPJ) == true)
            System.out.printf("%s\nValid CNPJ", CnpjValidator.writeCNPJ(CNPJ));
        else
            System.out.printf("Error, invalid CNPJ !!!\n");
    }

}