/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuyruk;



/**
 *
 * @author DELL
 */
public class Kuyruk {
    
    
    private int bas,son;
    private int [] bilgiler;
    private int kapasite;
    private int bos=0;
    
    
    
    
    public Kuyruk (int uzunluk){ 
        bas=-1;
        son=0;
        kapasite=uzunluk;
        bilgiler= new int [uzunluk];
    }
    
    public void enqueueEkle(int gelen){ //ekleme metot
    
        if (bas<=kapasite-1){
            bas++;
            bilgiler[bas]=gelen; 
        }
        else{
            System.out.println("Kuyruk Dolu.");
        }
    }
    
    
    public int dequeueCikart(){
        if (bas  >=son) {
            int degisken=bilgiler[son++];
            bilgiler[son-1]=0;   
            if (son>bas){
                son=0;
                bas=-1;
            }
            return degisken;
    }
        else{
           return bos;
        }    
    }
    
    public int gosterPrint(){
        if (bas>=son){
            return bilgiler[son]; 
        }
        else {
            return bos;
        }
    }

    
    
        
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("0 Boş demektir.");
        Kuyruk kuyruk1=new Kuyruk(3);
        kuyruk1.enqueueEkle(1);
        System.out.println("Kuyruk:"+kuyruk1.gosterPrint());
        kuyruk1.enqueueEkle(2);
        System.out.println("Kuyruk:"+kuyruk1.gosterPrint());
        kuyruk1.enqueueEkle(3);
        System.out.println("Kuyruk:"+kuyruk1.gosterPrint());
        kuyruk1.dequeueCikart();
        System.out.println("Kuyruk:"+kuyruk1.dequeueCikart());
        kuyruk1.dequeueCikart();
        System.out.println("Kuyruk:"+kuyruk1.dequeueCikart());
        kuyruk1.dequeueCikart();
        System.out.println("Kuyruk:"+kuyruk1.dequeueCikart());
      
   
        
    }
    
}
