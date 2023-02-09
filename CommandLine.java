public class commandlineargs
{
    public static void main(String[] arg){
        System.out.println("arg[0]= "+arg[0]+"\narg[1]= "+arg[1]);
        System.out.println("arg[2+3]= "+(Integer.parseInt(arg[2])+Integer.parseInt(arg[3])));
    }
}