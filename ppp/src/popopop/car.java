/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popopop;

/**
 *
 * @author LENOVO
 */
public class car {
    private int modl;
    private String make;
    public void setmodl(int m)
    {
     modl=m;
    }
    public void setmake(String s)
    {
    make=s;
    }
    public int getmodl()
    {
      return modl;
    }
    public String getmake()
    {
    return make;
    }
    public void print()
    {
     System.out.println("the model is ="+getmodl());
     System.out.println("the make is ="+getmake());
    }
}
