//First iteration

import java.util.*;

public class BuildingIDSys{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap <String, Integer> Id = new HashMap<>();
        
        System.out.println("This programm's data managment is flexible.\nIf You would like to...\nEnter new 'Employee' data = type 'E'\nChange existing data = type 'C'\nSign in = type 'S'\nTo exit = type L");
        String choice = sc.next();
        int choiceCount = 0;
        while (choice != "L"){

            if (choice.length() > 1){
                System.out.println("Please select a valid choice.");
            }

            if (choiceCount == 0 || choice == "E"){
                int N = sc.nextInt(); //Number of employees who will have their ID registered

                for (int i = 0; i < N; i++){
                    String idName = sc.next(); //Employee name
                    int idNum = sc.nextInt(); //Employee #
                    Id.put(idName, idNum);
                }

            }

            else if (choiceCount > 0 && choice == "S"){
                String nameEntry = sc.next();
                int numEntry = sc.nextInt();

                if (Id.containsKey(nameEntry) && Id.containsValue(numEntry)){
                    System.out.println("Access Granted");
                }
                else{
                    System.out.println("Invalid ID");
                }
            }



            choice = sc.next();
            
            if (choice.length() == 1){
                choiceCount++;
            }

            sc.close();
        }



       
    }
}

