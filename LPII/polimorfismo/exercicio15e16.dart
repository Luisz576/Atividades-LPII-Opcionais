// EXERCICIO 15 e 16 - Lista Polimorfismo
// Para não precisar compilar, use o site: https://dartpad.dev/

abstract class Animal{
  final String _nome;
  
  String getNome(){
    return _nome;
  }
  
  Animal(this._nome);
}

abstract class Mamifero extends Animal{
  Mamifero(String nome) : super(nome);
  
  amamentar(Mamifero m);
}

abstract class Passaro extends Animal{
  final int _mediaDeTamanho;
  
  String getMediaDeTamanho(){
    return "$_mediaDeTamanho cm";
  }
  
  Passaro(String nome, this._mediaDeTamanho) : super(nome);
  
  voar();
}

class BemTeVi extends Passaro{
  BemTeVi(String nome) : super(nome, 25);
  
  @override
  voar(){
    print("O Bem Te Vi $_nome está voando!");
  }
}

class Papagaio extends Passaro{
  Papagaio(String nome) : super(nome, 35);
  
  @override
  voar(){
    print("O Papagaio $_nome está voando!");
  }
}

class Cachorro extends Mamifero{
  Cachorro(String nome) : super(nome);
  
  @override
  amamentar(Mamifero m){
    print("A cachorra $_nome está amamentando ${m.getNome()}!");
  }
}

class Vaca extends Mamifero{
  Vaca(String nome) : super(nome);
  
  @override
  amamentar(Mamifero m){
    print("A vaca $_nome está amamentando ${m.getNome()}!");
  }
}

main(){
  Mamifero vaca = Vaca('Mimoza');
  Mamifero vaca2 = Vaca('Carlos');
  vaca.amamentar(vaca2);
  
  Mamifero cachorro = Cachorro('Tina');
  Mamifero cachorro2 = Cachorro('Lucas');
  cachorro.amamentar(cachorro2);
  
  Passaro papagaio = Papagaio('Stuart');
  papagaio.voar();
  
  Passaro bemtevi = BemTeVi('Vinicius');
  bemtevi.voar();
}