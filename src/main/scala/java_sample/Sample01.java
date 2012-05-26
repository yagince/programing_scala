package java_sample;

import java.util.HashMap;
import java.util.Map;

public class Sample01 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("hoge", "HOGE");
		map.put("foo", null);
		
		System.out.println(map.get("hoge"));
		System.out.println(map.get("foo"));
		System.out.println(map.get("bar"));
	}
}
