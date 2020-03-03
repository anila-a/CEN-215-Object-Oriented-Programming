package hw1;

public class ex1 {

	public static void main(String[] args) {
		String[] names = {"John", "Jack", "Jill", "James", "Jacob", "Jeremy", "Jim", "Jerry", "Jamie"};
		int[][] hours = {{5, 6, 4, 7, 8}, {7, 3, 5, 7, 4},
						{2, 9, 4, 3, 5}, {6, 6, 2, 4, 5},
						{5, 6, 6, 3, 3}, {5, 5, 5, 8, 8},
						{8, 8, 4, 7, 4}, {6, 4, 5, 6, 7},
						{3, 2, 6, 7, 4}};
		double paymentHr = 6.50;
		
		double[] avgWorkingHrs = avgHrs(names, hours);
		double[] avgPayment = avgPayment(names, hours, paymentHr);
		int[] totalWorkingHrs = totalHrs(names, hours);
		double[] totalPayment = totalPayment(names, hours, paymentHr);
		
		System.out.println("----------Before sort----------");
		System.out.println("Names\t" + "Mon\t" + "Tue\t" + "Wed\t" + "Thu\t" + "Fri\t" + "Avg working hrs\t " + " Avg payment\t" + "Total working hrs\t" + "Total payment");
		showList(names, hours, avgWorkingHrs, avgPayment, totalWorkingHrs, totalPayment);
		
		System.out.println();
		System.out.println("----------Sort according to average pay----------");
		System.out.println("Names\t" + "Average payment");
		showListAvgPaySort(names, hours, avgPayment);

		System.out.println();
		System.out.println("----------Sort according to average working hours----------");
		System.out.println("Names\t" + "Average working hrs");
		showListAvgWorkHrsSort(names, hours, avgWorkingHrs);
		
		System.out.println();
		System.out.println("----------Sort according to total payment----------");
		System.out.println("Names\t" + "Total payment");
		showListTotalPaymentSort(names, hours, totalPayment);
		
		System.out.println();
		System.out.println("----------Sort according to total working hours----------");
		System.out.println("Names\t" + "Total working hrs");
		showListTotalPaymentSort(names, hours, totalWorkingHrs);
	}

	private static void showListTotalPaymentSort(String[] names, int[][] hours, int[] totalWorkingHrs) {
		int temp;
		// Sort
		for(int i = 0; i < totalWorkingHrs.length-1; i++) {
			for(int j = i+1; j < totalWorkingHrs.length; j++) {
				if(totalWorkingHrs[i] < totalWorkingHrs[j]) {
					temp = totalWorkingHrs[i];
					totalWorkingHrs[i] = totalWorkingHrs[j];
					totalWorkingHrs[j] = temp;
				}
			}
		}
		// Print sorted list
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "\t" + totalWorkingHrs[i]);
		}
	}

	private static void showListTotalPaymentSort(String[] names, int[][] hours, double[] totalPayment) {
		double temp;
		// Sort
		for(int i = 0; i < totalPayment.length-1; i++) {
			for(int j = i+1; j < totalPayment.length; j++) {
				if(totalPayment[i] < totalPayment[j]) {
					temp = totalPayment[i];
					totalPayment[i] = totalPayment[j];
					totalPayment[j] = temp;
				}
			}
		}
		// Print sorted list
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "\t" + totalPayment[i]);
		}
		
	}

	private static void showListAvgWorkHrsSort(String[] names, int[][] hours, double[] avgWorkingHrs) {
		double temp;
		// Sort
		for(int i = 0; i < avgWorkingHrs.length-1; i++) {
			for(int j = i+1; j < avgWorkingHrs.length; j++) {
				if(avgWorkingHrs[i] < avgWorkingHrs[j]) {
					temp = avgWorkingHrs[i];
					avgWorkingHrs[i] = avgWorkingHrs[j];
					avgWorkingHrs[j] = temp;
				}
			}
		}
		// Print sorted list
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "\t" + avgWorkingHrs[i]);
		}
	}

	private static void showListAvgPaySort(String[] names, int[][] hours, double[] avgPayment) {
		double temp;
		// Sort
		for(int i = 0; i < avgPayment.length-1; i++) {
			for(int j = i+1; j < avgPayment.length; j++) {
				if(avgPayment[i] < avgPayment[j]) {
					temp = avgPayment[i];
					avgPayment[i] = avgPayment[j];
					avgPayment[j] = temp;
				}
			}
		}
		// Print sorted list
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "\t" + avgPayment[i]);
		}
	}

	private static double[] totalPayment(String[] names, int[][] hours, double paymentHr) {
		double[] total = new double[names.length];
		for(int i = 0; i < names.length; i++) {
			int sum = 0;
			for(int j = 0; j < 5; j++) {
				sum += (hours[i][j] * paymentHr);
			}
			total[i] = sum;
		}
		return total;
	}

	private static int[] totalHrs(String[] names, int[][] hours) {
		int[] total = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			int sum = 0;
			for(int j = 0; j < 5; j++) {
				sum += hours[i][j];
			}
			total[i] = sum;
		}
		return total;
	}

	private static double[] avgPayment(String[] names, int[][] hours, double paymentHr) {
		double[] avg = new double[names.length];
		for(int i = 0; i < names.length; i++) {
			int sum = 0;
			for(int j = 0; j < 5; j++) {
				sum += hours[i][j] * paymentHr;
			}
			avg[i] = sum / 5.0;
		}
		return avg;
	}

	private static void showList(String[] names, int[][] hours, double[] avgWorkingHrs, double[] avgPayment, int[] totalWorkingHrs, double[] totalPayment) {
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
			for(int j = 0; j < 5; j++) {
				System.out.print("\t" + hours[i][j]);
			}
			System.out.print("\t" + avgWorkingHrs[i] + "\t\t  " + avgPayment[i] + "\t\t" + totalWorkingHrs[i] + "\t\t\t" + totalPayment[i]);
			System.out.println();
		}
	}

	private static double[] avgHrs(String[] names, int[][] hours) {
		double[] avg = new double[names.length];
		for(int i = 0; i < names.length; i++) {
			int sum = 0;
			for(int j = 0; j < 5; j++) {
				sum += hours[i][j];
			}
			avg[i] = sum / 5.0;
		}
		return avg;
	}
}
