class garbagecollection 
{
    public void finalize()
    {
        System.out.println("It is invoked");
    }
    public static void main(String[] args) 
    {
        garbagecollection g1=new garbagecollection();
        g1=null;
        System.gc();
        System.runFinalization();
    }
                                                                 
}
