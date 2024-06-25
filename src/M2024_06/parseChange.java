package M2024_06;

public class parseChange {
	public static void main(String[] args) {
		String strValue = "10";
		String strValue2 = "200";
		String strValue3= "3000";
		String strValue4 = "10.999";
		String strValue5 = "20.888";
		String strValue6 = "true";
		String strValue7 = "false";
		
		byte byteValue = Byte.parseByte(strValue);
		System.out.println("byteValue =" + byteValue);
		
		short shortValue = Short.parseShort(strValue2);
		System.out.println("shortValue =" + shortValue);
		
		int intValue = Integer.parseInt(strValue3);
		System.out.println("intValue =" + intValue);

		long longValue = Long.parseLong(strValue3);
		System.out.println("longValue =" + longValue);
		
		float floatValue = Float.parseFloat(strValue4);
		System.out.println("floatValue =" + floatValue );
		
		double doubleValue = Double.parseDouble(strValue5);
		System.out.println("doubleValue =" + doubleValue);
		
		boolean booleanValue = Boolean.parseBoolean(strValue6);
		System.out.println("booleanValue =" + booleanValue);
		
		booleanValue = Boolean.parseBoolean(strValue7);
		System.out.println("booleanValue =" + booleanValue);
		
		
		
	}
}
