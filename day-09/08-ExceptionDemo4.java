class FushuException extends RuntimeException
{
	FushuException(String msg) {
		super(msg);
	}
}

class ExcepDemo3 {
    int div(int a, int b) // throws ArithmeticException
    {
		if(b < 0)
			throw new FushuException("���ֳ���Ϊ������");
        if(b == 0)
            throw new ArithmeticException("��0����");
        return a / b;
    }
}

class ExceptionDemo3
{
    public static void main(String[] args)
    {
        ExcepDemo3 d = new ExcepDemo3();
        int x = d.div(4, -7);
        System.out.println("x=" + x);
        
        System.out.println("over");
    }
}