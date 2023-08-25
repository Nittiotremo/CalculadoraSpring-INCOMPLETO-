package br.com.calculadora.projetocalculadora.services;

import org.springframework.stereotype.Service;

import br.com.calculadora.projetocalculadora.exceptions.NumeroInvalidoException;

@Service
public class CalculadoraService {
    public double somar(String n1, String n2){
        if(eNumero(n1)&& eNumero(n2)){
            return Double.parseDouble(n1) + Double.parseDouble(n2);
        }
        throw new NumeroInvalidoException("Um ou ambos os parametros não são numéricos");
    }

    public double subtrair(String n1, String n2){
        if(eNumero(n1)&& eNumero(n2)){
            return Double.parseDouble(n1) - Double.parseDouble(n2);
        }
        throw new NumeroInvalidoException("Um ou ambos os parametros não são numéricos");
    }

    public double multiplicar(String n1, String n2){
        if(eNumero(n1)&& eNumero(n2)){
            return Double.parseDouble(n1) * Double.parseDouble(n2);
        }
        throw new NumeroInvalidoException("Um ou ambos os parametros não são numéricos");
    }

    public double dividir(String n1, String n2){
        if(eNumero(n1)&& eNumero(n2)){
            if(n2.equals("0")){
                throw new ArithmeticException("O divisor não pode ser dividido por zero!");
            }
            return Double.parseDouble(n1) / Double.parseDouble(n2);
        }
        throw new NumeroInvalidoException("Um ou ambos os parametros não são numéricos");
    }

    private boolean eNumero(String numero){
        try{
            Double.parseDouble(numero);
            return true;
        } catch(Exception ex){
            return false;
        }
    }
}
