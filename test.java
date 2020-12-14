import java.util.Scanner;
import java.util.InputMismatchException;

public class MainProgram {
    public static void main(String[] args) {
        MainProgram mainProgram = new MainProgram();
        mainProgram.printBanner();
        while (true) {
            int studentID = mainProgram.receiveStudentID();
            mainProgram.runModule(studentID);
        }
    }

    public void printBanner() {
        System.out.println("[2020-Fall Software Engineering]");
        System.out.println("Simple Software Development Project");
        System.out.println();
    }

    public int receiveStudentID() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a student ID: ");
        return input.nextInt();
    }

    public void runModule(int studentID) {
        if (studentID == 11530)
            System.out.println("No. It is the professor ID.\n");
        else if (studentID == 1815060){
            System.out.println("[Student ID: "+studentID+"]");
            myfunc();
        }
        else if(studentID == 1814965) {
        	System.out.println("[Student ID: " + studentID + "]");
        	menu_1814965();
        }
	else if(studentID == 1815514) {
		System.out.println("[Student ID: 1815514]");

		calculate_1815514();
	}

	else if(studentID == 1814998) {
            System.out.println("[Student ID: " + studentID + "]");
            func_1814998();
        }

        else if(studentID == 1815330){
            System.out.println("[Student ID : "+ studentID +"]");
            hw_1815330();
        }
        
        else if(studentID == 1815542) {
        	System.out.println("[Student ID: " + studentID + "]");
        	hw_1815542();
        }
        
        else if(studentID == 1815595) {
        	System.out.println("[Student ID: " + studentID + "]");
        	hw_1815595();
        }       

        else{
            System.out.println("To be developed...\n");
        }
    }


    public void calculate_1815514(){
    	Scanner input = new Scanner(System.in);
	System.out.println("1.Calculate factorial");
	System.out.println("2.Calculate absolute value");
	int menu = input.nextInt();
	if(menu == 1){
		System.out.print("Enter factorial number: ");
		int num1 = input.nextInt();
		System.out.println("The result of "+num1+"! is "+getFactorial(num1)+".");
	}
	else if(menu==2){
		System.out.print("Enter number you want to change into absolute value: ");
		int num2 = input.nextInt();
		System.out.println("The Absolute value of "+num2+" is "+getAbsolute(num2)+".");
	}
	return;
    }
    public int getFactorial(int n){
	    int result = 1;
	    for(int i=1;i<=n;i++){
		    result = result * n;
	    }
	    return result;
    }
    public int getAbsolute(int n){
	    int result =0;
	    if(n>=0) result = n;
	    else result = (-1)*n;
	    return result;
    }

    public void myfunc(){
        Scanner sc = new Scanner(System.in);
        int num,a,b;
        while(true){
            try{
                System.out.println("1. Calculate max");
                System.out.println("2. Calculate min");
                System.out.print("Enter menu number(1 or 2): ");
                num = sc.nextInt();
                if(num==1){
                    while(true){
                        try{
                            System.out.print("Enter two integers to compare:");
                            a = sc.nextInt();
                            b = sc.nextInt();
                            System.out.println("Max value is " +max(a,b));
                            return;
                        }
                        catch(InputMismatchException ime2){
                            System.out.println("Enter two integers :(");
                            sc = new Scanner(System.in);
                        }
                    }
                }
                if(num==2){
                    while(true){
                        try{
                            System.out.print("Enter two integers to compare:");
                            a = sc.nextInt();
                            b = sc.nextInt();
                            System.out.println("Min value is " +min(a,b));
                            return;
                        }
                        catch(InputMismatchException ime2){
                            System.out.println("Enter two integers :(");
                            sc = new Scanner(System.in);
                        }
                    }
                }
                if((num!=1)&&(num!=2)){
                    System.out.println("Enter 1 or 2 :(");
                    sc = new Scanner(System.in);
                }
            }
            catch(InputMismatchException ime){
                System.out.println("Enter 1 or 2 :(");
                sc = new Scanner(System.in);
            }
        }
    }

    public void menu_1814965() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("1. Calculate the distance between two points in a two dimensional.");
    	System.out.println("2. Calculate the least common multiple of two numbers.");
    	System.out.print("Enter menu number: ");
    	int num = input.nextInt();
    	if(num == 1) {
    		double A[][] = new double[2][2];
    		char arr[] = {'A', 'B', 'x', 'y'};
    		String str[] = new String[2];
    		for(int i = 0, j; i < 2; i++) {
    			str[i] = arr[i] + "(";
    			for(j = 0; j < 2; j++) {
    				System.out.print("Enter " + arr[i] + "'" + arr[j+2] + ": ");
            		A[i][j] = input.nextDouble();
            		if(j != 1)
            			str[i] += A[i][j] + ", ";
            		else
            			str[i] += A[i][j] + ")";
    			}
    			System.out.println(str[i]);
    		}
    		System.out.println("=> the distance between " + str[0] + " and " + str[1] + " is " + DistanceOfTwoPoints_1814965(A[0], A[1]) + "\n");
    	}
    	else if(num == 2) {
    		System.out.print("Enter natural number X (0 < X <= 100): ");
        	num = input.nextInt();
    		int a;
    		System.out.print("Enter natural number Y (0 < Y <= 100): ");
        	a = input.nextInt();
    		if((a < 1 || a > 100) || (num < 1 || num > 100))
    			System.out.println("RANGE ERROR: the input value is not the natural number of 100 or below\n");
    		else
    			System.out.println("=> the least common multiple of two numbers " + num + " and " + a + " is " + LeastCommonMultiple_1814965(num, a) + "\n");
    	}
    	return;
    }

    public void hw_1815595(){
    	//TODO
    }
    public int max(int a,int b){
        return (a>b)? a:b;
    }
    public int min(int a,int b){
        return (a<b)? a:b;
    }

    public double DistanceOfTwoPoints_1814965(double[] A, double[] B) {
    	double n = (A[0]-B[0]) * (A[0]-B[0]) + (A[1]-B[1]) * (A[1]-B[1]);
    	double x = 1;
    	for(int i = 0; i < 10; i++)
    		x = (x + (n/x))/2;
    	return x;

    }
    public int LeastCommonMultiple_1814965(int x, int y) {
    	int least = x * y;
    	for(int i = y-1; i > 0; i--)
    		if((x * i) % y == 0)
    			least = x * i;
    	return least;
    }

    public void hw_1815330(){
        Scanner sc = new Scanner(System.in);
        int m,a,b;

        System.out.println("1. Calculate the min of two integers");
        System.out.println("2. Calculate the max of two integers");
        System.out.print("Enter menu numbers : ");
        m=sc.nextInt();

        System.out.print("Input number 1 :");
        a=sc.nextInt();
        System.out.print("Input number 2 : ");
        b=sc.nextInt();

        if(m==1){
            hw_min_1815330(a,b);
        }else if(m==2){
            hw_max_1815330(a,b);
        }else{
            System.out.println("wrong menu number!");
        }
    }
    public void hw_min_1815330(int a,int b){
        int answer;
        if(a>=b)
            answer=b;
        else
            answer=a;
        System.out.println("The min is "+answer);
    }
    public void hw_max_1815330(int a,int b){
        int answer;
        if(a>=b)
            answer=a;
        else
            answer=b;
        System.out.println("The max is "+answer);
    }





public void func_1814998(){
      Scanner scan = new Scanner(System.in);
      int select, number1, number2, number3, answer;
      System.out.println("1.Calculate Maximum");
      System.out.println("2.Calculate Minimum");
      System.out.print("Enter menu number: ");
      select = scan.nextInt();

      System.out.println("please enter your number");
      System.out.print("number1 : ");
      number1 = scan.nextInt();
      System.out.print("number2 : ");
      number2 = scan.nextInt();
      System.out.print("number3 : ");
      number3 = scan.nextInt();

      if(select==1){
        answer = calcThreeIntMax(number1, number2, number3);
        System.out.println("Maximun number is "+answer);
      }
      else if(select==2){
        answer = calcThreeIntMin(number1, number2, number3);
        System.out.println("Minimum number is "+answer);
      }
    }

    public static int calcThreeIntMax(int n1, int n2, int n3){
      int max;
      max = (n1 > n2)? n1:n2;
      max = (max > n3)? max:n3;
      return max;
    }

    public static int calcThreeIntMin(int n1, int n2, int n3){
      int min;
      min = (n1 < n2)? n1:n2;
      min = (min < n3)? min:n3;
      return min;
    }
    
    public void hw_1815542() {
    	int a, b, c;
    	int menu;
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("1. Calculate Triangle Area");
        System.out.println("2. Calculate Trapezoid Area");
        System.out.print("Enter menu number: ");
    	
        menu = sc.nextInt();
        
        if(menu == 1) {
        	System.out.println("[Calculate Triangle Area]");
        	System.out.print("Enter base(쨔횠쨘짱): ");
        	a = sc.nextInt();
        	System.out.print("Enter height(쨀척�횑): ");
        	b = sc.nextInt();
        	System.out.println("triangle Area : " + triangleArea(a, b));
        }
        else if(menu == 2) {
        	System.out.println("[Calculate Trapezoid Area]");
        	System.out.print("Enter base1(�짯쨘짱): ");
        	a = sc.nextInt();
        	System.out.print("Enter base2(쨔횠쨘짱): ");
        	b = sc.nextInt();
        	System.out.print("Enter height(쨀척�횑): ");
        	c = sc.nextInt();
        	System.out.println("trapezoid Area : " + trapezoidArea(a, b, c));
        }
        else
        	System.out.println("Wrong: You can select only 1 or 2");
    }
    
    public int triangleArea(int a, int b) {
    	int area;
    	area = a * b / 2;
		return area;
    }

    public int trapezoidArea(int a, int b, int c) {
    	int area;
    	area = ((a + b) * c) / 2;
		return area;
    }
}
