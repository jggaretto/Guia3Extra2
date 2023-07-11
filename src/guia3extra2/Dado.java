/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extra2;

//import java.util.Random;

class Dado {
    int numero;
  //  Random random;
    
    public Dado() {
        this.numero = 0;
    //    this.random = new Random();
    }
    
    public void generarNro() {
        if (this.numero == 0) {
      //  this.numero = random.nextInt(6) + 1;
        this.numero = (int) (Math.random()* 6) + 1;
        }
    }
    
    public int verNro() {
        return this.numero;
    }
}

