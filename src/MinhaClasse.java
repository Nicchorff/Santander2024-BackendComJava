public class MinhaClasse
{
    public static void main(String[] args)
    {
        var nomeCompleto = nomeCompleto("Pedro","Kerkoff");
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String fname, String lname)
    {
        return "Method result: " + fname.concat(" ").concat(lname);
    }
}
