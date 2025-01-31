/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author niles
 */
public class Bullet {
    public Bullet next;
  public int isLive;
  
  public Bullet(int isLive) {
    next = null;
    this.isLive = isLive;
  }
}
