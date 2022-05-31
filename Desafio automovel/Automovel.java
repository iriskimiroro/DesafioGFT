class Automovel {
  public static void main(String[] args) {
    string combustivel;
    string modelo;
    int Capacidadetanque;
    /// construtor aqui/
Automovel (){

}
Automovel (string cor, string modelo, int Capacidadetanque) {
 this.cor = cor; /*Paramentros*/
 this.modelo = modelo;
 this.Capacidadetanque = Capacidadetanque;    
}
     /* set serve para setar, colocar valor no atributo*/
void setcor(string cor){
    this.cor = cor;

}
/*  get serve para devolver o valor */
string getcor(){
    return cor;
}
void setmodelo(string modelo){
    this.modelo = modelo;

}

string getmodelo(){
    return modelo;
}

void setCapacidadetanque (int capacidadetanque) {
    this.capacidadetanque = capacidadetanque;
}

 int getCapacidadetanque() {
    return capacidadetanque;
}
/* Double representa um valor fracionados, com maior casas decimais */
 double totalvalortanque (double valorcombustivel){
   return capacidadetanque * valorcombustivel; 
 }
 System.out.println()
 }
