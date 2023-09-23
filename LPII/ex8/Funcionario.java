package ex8;

import java.util.Date;

public class Funcionario {
    public int id = -1, horas = 0;
    public double valorHora = 0;
    public String cpf, nome, email, rg, endereco, nis, escolaridade, cargo, contaBanco;
    public Date dataNascimento, entradaEmpresa;

   public double getSalario(){
    return horas * valorHora;
   }
}