package ex8;

import java.util.Date;

public class Ex8 {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        funcionario.id = 1;
        funcionario.horas = 10;
        funcionario.valorHora = 20;
        funcionario.nome = "Teste Pereira";
        funcionario.cpf = "3434534543";
        funcionario.email = "fedgerg4@gmail.com";
        funcionario.rg = "2423442342";
        funcionario.endereco = "fuywgfu wbuwhuw wefwf";
        funcionario.nis = "32324242";
        funcionario.escolaridade = "Superior";
        funcionario.cargo = "A";
        funcionario.contaBanco = "242342";
        funcionario.dataNascimento = new Date();
        funcionario.entradaEmpresa = new Date();

        Cliente cliente = new Cliente();
        cliente.cpf = "43645645";
        cliente.dataPrimeiraCompra = new Date();
        cliente.email = "sdfgfw@gmail.com";
        cliente.endereco = "ewfwfw";
        cliente.login = "sdfwef";
        cliente.nome = "Teste da Silva";
        cliente.rg = "2321423";
    }
}
