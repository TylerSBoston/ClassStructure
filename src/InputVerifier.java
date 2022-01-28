import java.util.Scanner;

public class InputVerifier {

	public static int verifyInt(Scanner input)
	{
		int number = 0;
		if(input.hasNextInt())
			number = input.nextInt();
		input.nextLine();
		return number;
	}
	public static int verifyInt(Scanner input, int baseNumber)
	{
		if(input.hasNextInt())
			baseNumber = input.nextInt();
		input.nextLine();
		return baseNumber;
	}
	public static float verifyFloat(Scanner input)
	{
		float number = 0;
		if(input.hasNextFloat())
			number = input.nextFloat();
		input.nextLine();
		return number;
	}
	public static String verifyString(Scanner input)
	{
		String inputString = input.nextLine();
		return inputString;
	}
}
