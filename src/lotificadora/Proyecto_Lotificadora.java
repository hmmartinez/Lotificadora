package lotificadora;

public class Proyecto_Lotificadora {
public static Terreno[][] terrenos = new Terreno[4][4];

public static boolean ocupado(int x, int y){

    if (terrenos[x][y].isOcupado() == false) {
        return true;
    }else
        return false;
    
    
}
   public static int ocupados(){
        int cont1=0;

        for (int i = 0; i < terrenos.length; i++) {
            for (int j = 0; j <terrenos.length; j++) {
                if(terrenos[i][j].isOcupado()== true){
                    cont1++;
                    
                }
            }
        }
        return cont1;
    }
    
    public static double totalPagar(){
        double total=0;
        for (int i = 0; i < terrenos.length; i++) {
            for (int j = 0; j < terrenos.length; j++) {
                total+= terrenos[i][j].getPrecioTotal();
            }
        }
        return total;
    }
    public static int LosVacios(){
        int cont2=0;
        for (int i = 0; i < terrenos.length; i++) {
            for (int j = 0; j <terrenos.length; j++) {
                if(terrenos[i][j].isOcupado()== false){
                    cont2++;
                    
                }
            }
        }
        return cont2;
}
}
