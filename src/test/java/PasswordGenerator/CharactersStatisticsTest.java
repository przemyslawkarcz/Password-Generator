package PasswordGenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

public class CharactersStatisticsTest {

    @Test
    public void countsIndividualCharactersOfPasswordTestNotNull(){

        CharactersStatistics charactersStatistics = new CharactersStatistics();
        Map<Character, Integer> characterIntegerMap = charactersStatistics.countsIndividualCharactersOfPassword();

        Assertions.assertNotNull(characterIntegerMap);

    }

    @Test
    public void countsIndividualCharactersOfPasswordTestSize(){

        CharactersStatistics charactersStatistics = new CharactersStatistics();
        Map<Character, Integer> characterIntegerMap = charactersStatistics.countsIndividualCharactersOfPassword();

        int size = characterIntegerMap.size();

        Assertions.assertNotEquals(17, size);

    }

    @Test
    public void countsIndividualCharactersOfPasswordTestKey(){

        CharactersStatistics charactersStatistics = new CharactersStatistics();
        Map<Character, Integer> characterIntegerMap = charactersStatistics.countsIndividualCharactersOfPassword();

        Character c = 'a';

        Character key = null;

        for (Map.Entry<Character, Integer> map:characterIntegerMap.entrySet()) {

            key = map.getKey();

        }

        Assertions.assertNotEquals(c, key);

    }

    @Test
    public void countsIndividualCharactersOfPasswordTestValue(){

        CharactersStatistics charactersStatistics = new CharactersStatistics();
        Map<Character, Integer> characterIntegerMap = charactersStatistics.countsIndividualCharactersOfPassword();

        int i = 17;

        Integer value = null;

        for (Map.Entry<Character, Integer> map:characterIntegerMap.entrySet()) {

            value = map.getValue();

        }

        Assertions.assertNotEquals(i, value);

    }

    @Test
    public void countsIndividualCharactersOfPasswordTestWholeMapValues(){

        CharactersStatistics charactersStatistics = new CharactersStatistics();
        Map<Character, Integer> characterIntegerMap = charactersStatistics.countsIndividualCharactersOfPassword();

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('c', 1);
        map.put('r', 1);
        map.put('S', 1);
        map.put('X', 1);
        map.put('M', 1);
        map.put('9', 1);
        map.put('2', 1);
        map.put('5', 1);
        map.put('#', 1);
        map.put('@', 1);
        map.put('$', 1);
        map.put('n', 1);
        map.put('N', 1);
        map.put('ń', 1);
        map.put(')', 1);

        Assertions.assertNotEquals(map, characterIntegerMap);

    }

}
