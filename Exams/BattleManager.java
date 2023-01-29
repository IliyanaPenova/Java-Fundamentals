package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BattleManager {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Map<String,Integer>healthMap=new LinkedHashMap<>();
        Map<String,Integer> energyMap=new LinkedHashMap<>();
        String command= scanner.nextLine();
        while(!command.equals("Results")){
            String[] input=command.split(":");
            String dataInput=input[0];
            switch (dataInput){
                case"Add":
                    String personName=input[1];
                    int health = Integer.parseInt(input[2]);
                    int energy = Integer.parseInt(input[3]);
                  if(!healthMap.containsKey(personName)&&!energyMap.containsKey(personName)) {

                      healthMap.put(personName, health);
                      energyMap.put(personName, energy);
                  }else {
                      int newHealth=healthMap.get(personName)+health;
                      healthMap.put(personName,newHealth);
                      int newEnergy=energyMap.get(personName)+energy;
                      energyMap.put(personName,newEnergy);
                  }
                    break;
                case"Attack":
                    String attackerName=input[1];
                    String defenderName=input[2];
                    int damage=Integer.parseInt(input[3]);
                    if(healthMap.containsKey(attackerName)&& healthMap.containsKey(defenderName)&&
                            energyMap.containsKey(attackerName)&& energyMap.containsKey(defenderName)){
                        int healthDefender=healthMap.get(defenderName)-damage;
                        healthMap.put(defenderName,healthDefender);
                       int energyAttacker=energyMap.get(attackerName)-1;
                        int newEnergyAttacker=energyMap.get(attackerName)-energyMap.get(defenderName);
                        energyMap.put(attackerName,newEnergyAttacker-1);
                        if(healthDefender<=0){
                            healthMap.remove(defenderName);
                            healthMap.remove(attackerName);
                            System.out.printf("%s was disqualified!%n",defenderName);
                        }
                        if(energyAttacker<=0){
                            energyMap.remove(attackerName);
                            energyMap.remove(defenderName);
                            System.out.printf("%s was disqualified!%n",attackerName);
                        }
                    }
                    break;
                case"Delete":
                    String userName=input[1];
                    if (healthMap.containsKey(userName)) {
                        healthMap.remove(userName);
                        energyMap.remove(userName);
                    } else if (userName.equals("All")) {
                        healthMap.clear();
                        energyMap.clear();
                    }
                    break;
            }
            command= scanner.nextLine();
        }
        System.out.printf("People count: %d%n",energyMap.size());
        for (Map.Entry<String, Integer> stringEntry : healthMap.entrySet()) {
            System.out.printf("%s - %d - %d%n", stringEntry.getKey(),stringEntry.getValue(),energyMap.get(stringEntry.getKey()));

        }

    }
}
