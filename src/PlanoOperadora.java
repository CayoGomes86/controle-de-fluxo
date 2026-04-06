public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "l";

        switch (plano) {
            case "T":
                System.out.print("5 GB de YouTube + ");    
            case "M":
                System.out.print("Whats e Instagram + ");
            case "B":
                System.out.println("100 minutos de ligação");
                break;
            default:
                System.out.println("INDEFINIDO");
                break;
        }
    }
    
}
