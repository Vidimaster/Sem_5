import java.util.*;
import java.util.stream.Collectors;

public class telNumber {
    private HashMap<String, List<Integer>> hashmap = new HashMap<>();

    void add(String lastName, Integer telNum) {
        List<Integer> tels = new ArrayList<>();
        tels.add(telNum);
        if (!hashmap.containsKey(lastName)) {
            hashmap.put(lastName, tels);
        } else {
            hashmap.get(lastName).add(telNum);
        }

    }

    String getByTelNum(Integer telNum) {
        StringBuilder stringBuilder = new StringBuilder();
        for (HashMap.Entry entry : hashmap.entrySet()) {
            List <Integer> list = (List<Integer>) entry.getValue();
            for (Integer tel : list) {
                if (tel.equals(telNum)) {
                    stringBuilder
                            .append(entry.getKey())
                            .append(" Phone numbers: ")
                            .append(entry.getValue())
                            .append("\n");
                    return stringBuilder.toString();
                }
            }

        }
        return stringBuilder.toString();
    }

    String getByLastName(String lastName) {
        StringBuilder stringBuilder = new StringBuilder();
        for (HashMap.Entry entry : hashmap.entrySet()) {
            if (entry.getKey().equals(lastName)) {
                stringBuilder
                        .append(lastName)
                        .append(" Phone numbers: ")
                        .append(entry.getValue())
                        .append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String getAll() {
        LinkedHashMap<String, List<Integer>> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<String, List<Integer>> entry : hashmap.entrySet()) {
            list.add(entry.getValue().size());
        }
        Collections.sort(list, Collections.reverseOrder());
        for (Integer siz : list) {
            for (HashMap.Entry<String, List<Integer>> entry : hashmap.entrySet()) {
                if (entry.getValue().size() == siz) {
                    sortedMap.put(entry.getKey(), entry.getValue());
                }
            }
        }

        return sortedMap.toString();
    }
}
