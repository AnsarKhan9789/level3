package method;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Method {
public Map<String,Integer>map =new HashMap<>();
public List<Map<String,Integer>>list=new ArrayList<>();
public int index=-1;
public void begin() {
	list.add(map);
	map=new HashMap<>();
	index=index+1;
	map.putAll(list.get(index));
	
	
}
public void commit() {
//	map.putAll(list.get(index));
	System.out.println(map);
	//index--;
}
public void rollBack() {
	System.out.println(map);
	map=list.get(index);
	System.out.println(map);
	index--;
}
public void add(String key,int value) {
	map.put(key, value);
}
public int get(String key) {
	if(map.get(key)==null) {
		return 0;
	}
	return map.get(key);
}
}
