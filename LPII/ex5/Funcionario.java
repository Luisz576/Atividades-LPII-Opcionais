package ex5;

public class Funcionario {
    public int id = -1, horas = 0;
    public double valorHora = 0;

   public double getSalario(){
    return horas * valorHora;
   }
}