class StringDemo
{
	public static void main(String[] args)
	{
		String s1 = "abc";
		
		// s1 = "kk";
		// System.out.println(s1);

		String s2 = new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}