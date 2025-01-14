import java.util.HashMap;

public class Exemplos {

    public static void main(String[] args) {
        //Adicionar elementos
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("A", 1);
        mapa.put("B", 2);

        System.out.println(mapa);

        //Buscar elementos
        Integer valorA = mapa.get("A");
        
        System.out.println(valorA);

        //Remover elementos
        mapa.remove("A");
        
        System.out.println(mapa);

        //Verificar a presença de elemenos
        boolean temChaveA =  mapa.containsKey("B");

        System.out.println(temChaveA);

        System.out.println(mapa.containsValue(10));
        
        //Obter o tamanho
        System.out.println(mapa.size());

        //Limpar o mapa
        mapa.clear();
        System.out.println(mapa);
        



    }
}
