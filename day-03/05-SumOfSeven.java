class SumOfSeven
{
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for (int i = 1; i <= 100 ; i++ )
		{
			if (i % 7 == 0)
			{
				count++;
				sum += i;
			}
		}

		System.out.println("100����7�ı����ĺ��ǣ�" + sum + ",7�ı������ƣ�" + count + "��");
	}
}