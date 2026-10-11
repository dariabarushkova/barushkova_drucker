public class Drucker {
    
    private String modell;
    private int dpi;
    private boolean farbdruck;
    
    
    public Drucker ()
    {
     modell= "UNKN";
     dpi = 0;
     farbdruck = false;
    }
    
    
    public String getModell()
    {
        return modell;
    }
    
    public int getDpi()
    {
        return dpi;
    }
    
    public boolean getFarbdruck()
    {
        return farbdruck;
    }
    
    
    
   public void setModell(String neuModell)
   {
      modell = neuModell;  
   }
     
    public void setDpi(int neuDpi)
   {
       if (neuDpi > 100 && neuDpi < 9600)
       {
          dpi = neuDpi;  
       }
       else
       {
           System.out.println("Fehler");
           dpi = 0;
       }

   }

    public void setFarbdruck(boolean neuFarbdruck)
   {
    farbdruck = neuFarbdruck;
   } 
   
   public void printDrucker()
   {
   System.out.println(modell + " Drucker: " + dpi + " DPI " + "- " +farbdruck);
   }
   
   
}