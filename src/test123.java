import java.util.ArrayList;
import java.util.Arrays;

class test123 {
    public static void main(String[]args){
        String[] array1 = {"Alex", "Dima", "Kate", "Galina", "Ivan"};
        ArrayList<String> a1 = new ArrayList<>(Arrays.asList(array1));
        String[] array2 = {"Dima", "Ivan", "Kate"};
        ArrayList<String> a2 = new ArrayList<>(Arrays.asList(array2));

        System.out.println("Elements from the first collection: ");
        System.out.println(a1);
        System.out.println("Elements from the second collection: ");
        System.out.println(a2);

        for(int i = 0; i < a2.size(); i++){
            for(int j = 0; j < a1.size(); j++){
                if(a2.get(i).equals(a1.get(j)) == true){
                    a1.remove(j);
                }

            }
        }
        System.out.println("The elements which exist in collection1, but not exist in collection2:");
        System.out.println(a1);

    }
    }
