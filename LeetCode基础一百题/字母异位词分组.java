import java.util.*;

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<String, List<String>>();
    for (String str : strs) {
      char[] array = str.toCharArray();
      Arrays.sort(array);
      String key = new String(array);
      if (map.containsKey(key)) {
        List<String> list = map.get(key);
        list.add(str);
      } else {
        List<String> list = new ArrayList();
        list.add(str);
        map.put(key, list);
      }
    }
    return new ArrayList<List<String>>(map.values());
  }
}