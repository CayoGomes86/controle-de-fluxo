public class SistemaDeMedidas {
    public static void main(String[] args) {
        String medida = "k";

        switch (medida) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MÉDIO");
                break;
            case "G":
                System.out.println("GRANDE"); 
                break;   
            default:
                System.out.println("INDEFINIDO");
                break;
        }
    }
    
}
