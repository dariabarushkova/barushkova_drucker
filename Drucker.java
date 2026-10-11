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
    dpi = neuDpi;
   }

    public void setFarbdruck(boolean neuFarbdruck)
   {
    farbdruck = neuFarbdruck;
   } 
}