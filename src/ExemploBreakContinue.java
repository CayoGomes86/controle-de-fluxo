public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        for(int i = 0; i < 10; i++){
            if(i == 6){
                break;
            }
            System.out.println(i);
        }
        System.out.println("----------------------------------");
        for(int j = 0; j < 10; j++){
            if(j == 6){
                System.out.println("pulou o 6...");
                continue;
            }
            System.out.println(j);
        }
    }

}
