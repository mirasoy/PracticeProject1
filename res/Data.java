package res;


public class Data {
	public int top = 0;
	public String[] key = new String[100];
	public Object[] value = new Object[100];

	public Object get(String s) {
		//
		for (int i = 0; i < top; i++) {
			if (key[i].equals(s)) {
				return value[i];

			}
		}
		return null;

	}

	public void put(String s, Object o) {
		for (int i = 0; i < top; i++) {

			if (key[i].equalsIgnoreCase(s)) {
				value[i] = o;
				return;
			}

		}

		key[top] = s;
		value[top] = o;
		top++;
	}

}
