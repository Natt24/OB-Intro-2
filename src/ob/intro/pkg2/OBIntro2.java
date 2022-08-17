package ob.intro.pkg2;

public class OBIntro2 {

    public static void main(String[] args) {
        int numeroIf = -1;
        int numeroWhile = 0;
        int numeroDoWhile = 0;
        int numeroFor = 0;
        String estacion = "Invierno";
        
        condicional(numeroIf);
        bucleWhile(numeroWhile);
        bucleDoWhile(numeroDoWhile);
        bucleFor(numeroFor);
        Switch(estacion);
        

    }
    
    public static void condicional(int numeroIf){
        if(numeroIf < 0){
            System.out.println("Es negativo");
        }else{
            System.out.println("Es positivo");
        }
    }
    
    public static void bucleWhile(int numeroWhile){
        while(numeroWhile < 3){
            System.out.println(numeroWhile ++);
        }
    }
    
    public static void bucleDoWhile(int numeroDoWhile){
        do{
            System.out.println(numeroDoWhile ++);
            System.out.println(numeroDoWhile ++);
            System.out.println(numeroDoWhile ++);
        }while(numeroDoWhile<3);
    }
    
    public static void bucleFor(int numeroFor){
        
        for (int i = 0; i <= 3; i++) {
            System.out.println(numeroFor ++);
        }
    }
    
    public static void Switch(String estacion){
        switch(estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Primaver":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("Esta no es una estacion");
                break;
        }
    }
    
}
