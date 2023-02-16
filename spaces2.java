class spaces2 {
	static String removeSpace(String str)
	{
		str = str.replaceAll("\\s","");
		return str;
	}
	public static void main(String args[])
	{
		String str = "d e b a y u d h ";
		System.out.println(removeSpace(str));
	}
}
