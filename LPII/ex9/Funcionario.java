package ex9;

import java.util.Date;

public class Funcionario extends Pessoa {
    public int id = -1, horas = 0;
    public double valorHora = 0;
    public String nis, escolaridade, cargo, contaBanco;
    public Date dataNascimento, entradaEmpresa;

   public double getSalario(){
    return horas * valorHora;
   }
}