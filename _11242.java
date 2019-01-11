package me.mukla.acm;

import java.util.Scanner;

class _11242 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextDouble()) {
			double f = sc.nextDouble();
			if (f == 0) {
				break;
			}
			double r = sc.nextDouble();

			double F[] = new double[(int) f];
			double R[] = new double[(int) r];
			double[] arr = new double[(int) (f * r)];

			for (int i = 0; i < f; i++) {
				F[i] = sc.nextDouble();
			}
			for (int i = 0; i < r; i++) {
				R[i] = sc.nextDouble();
			}
			int index = 0;
			for (int i = 0; i < F.length; i++) {
				for (int j = 0; j < R.length; j++) {
					arr[index++] = F[i] / R[j];
				}
			}
			mergeSort(arr);

			double spread = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				double ratio = arr[i + 1] / arr[i];
				if (ratio > spread) {
					spread = ratio;
				}
			}
			System.out.printf("%.2f", spread);
			System.out.println();
		}
		sc.close();
	}

	public static void mergeSort(double[] inputArray) {

		int n = inputArray.length;
		if (n >= 2) {
			int mid = n / 2;

			double[] left = new double[mid];
			double[] right = new double[n - mid];
			for (int i = 0; i < mid; i++) {
				left[i] = inputArray[i];
			}

			for (int i = mid; i < n; i++) {
				right[i - mid] = inputArray[i];
			}

			mergeSort(left);
			mergeSort(right);

			merge(left, right, inputArray);
		}

	}

	public static void merge(double[] left, double[] right, double[] finalArray) {
		int nL = left.length;
		int nR = right.length;

		int i = 0, j = 0, k = 0;

		while (i < nL && j < nR) {
			if (left[i] < right[j]) {
				finalArray[k] = left[i];
				i++;
				k++;
			} else {
				finalArray[k] = right[j];
				j++;
				k++;
			}
		}
		while (i < nL) {
			finalArray[k] = left[i];
			i++;
			k++;
		}

		while (j < nR) {
			finalArray[k] = right[j];
			j++;
			k++;
		}

	}
}
