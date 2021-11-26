package PasswordGenerator;

import java.util.HashMap;
import java.util.Map;
import static PasswordGenerator.PasswordStrength.password;

public class CharactersStatistics {

    //method counts all types of password characters and loads them into the map collection
    public Map<Character, Integer> countsIndividualCharactersOfPassword() {

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

            String lineOfText = String.valueOf(password);

            char[] charArray = lineOfText.toCharArray();

            for (char c : charArray) {

                if (!characterIntegerMap.containsKey(c)) {

                    characterIntegerMap.put(c, 1);

                } else {

                    Integer counter = characterIntegerMap.get(c);
                    counter++;
                    characterIntegerMap.put(c, counter);
                }

            }

        System.out.print("Characters in password individually: ");
        for (Map.Entry<Character, Integer> map:characterIntegerMap.entrySet()) {

            Character key = map.getKey();
            Integer value = map.getValue();

            System.out.print(key + ":" + value + " | ");

        }

        return characterIntegerMap;

    }

}
