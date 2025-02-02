/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.Random;
/**
 *
 * @author niles
 */
public class Shotgun {
    public Bullet front;
    public Bullet rear;
    public Bullet current;
    public int num;
  
    public Shotgun(){
        front = null;
        rear = null;
        current = null;
        num = 0;
  }

    public int shoot(){
        if(this.front==null){
            Random rand = new Random();
            int rando = rand.nextInt(4,9);
            reload(rando);
        }
        Bullet shotBullet = front;
        front = front.next;
        num--;
        System.out.println(shotBullet.isLive);
        return shotBullet.isLive;
  }

  public void reload(int numBullets){
        num = numBullets;
        System.out.println(numBullets);
        for(int i = 0; i < numBullets; i++){
        Random rand = new Random();
        int rando = rand.nextInt(0,2);
        Bullet bullet = new Bullet(rando);
        if(front == null){
            front = bullet;
            rear = bullet;
      }
        else{
            rear.next = bullet;
            rear = bullet;
      }
    }
  }

  public int print(){
    current = front;
    int live = 0;
    while(current != null){
      System.out.println(current.isLive);
      if(current.isLive==1){
          live++;
      }
      current = current.next;
    }
    return live;
  }

  public int inspect(){
    if(front.isLive == 0){
      System.out.println("It's a Blank");
      return 0;
    }
    else{
      System.out.println("It's a Live Round");
      return 1;
    }
  }

  public int rack(){
    Bullet shotBullet = front;
    front = front.next;
    num--;
    System.out.println(shotBullet.isLive);
    return shotBullet.isLive;
  }

  public String phone(){
    Random rand = new Random();
    int rando = rand.nextInt(1,num);
    current = front;
    for(int i = 0; i < rando; i++){
      current = current.next;
    }
    rando =rando+1;
    System.out.println("bullet at "+rando +" is "+ current.isLive);
    if(current.isLive ==1){
        return ("bullet at "+rando +" is live");
    }
    else{
        return ("bullet at "+rando +" is blank");
    }
  }
  
  public void invert(){
      if(front.isLive == 1){
          front.isLive = 0;
      }
      else{
          front.isLive=1;
      }
  }
}
