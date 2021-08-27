package cauculadora.TUI;

import java.util.Scanner;

import cauculadora.tratamento.CaucularValores;

public class Mostrar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int res = 1;
		while (res != 0) {
			System.out.println("Escolha uma operação: ");
			System.out.println("1 - Soma ");
			System.out.println("2 - Subtração ");
			System.out.println("3 - Divisão ");
			System.out.println("4 - Multiplicação ");
			System.out.println("0 - Sair ");
			res = s.nextInt();
			if (res != 0)
				System.out.println("o resultado é: " + selecao(res));
		}
	}

	private static int selecao(int res) {
		CaucularValores c = new CaucularValores();
		Scanner s = new Scanner(System.in);
		int resul = 0;
		int quantNum = 0;
		int[] nums = new int [1];
		if (res == 1) {
			System.out.println("quantos numeros deseja somar?: ");
			quantNum = s.nextInt();
			nums = new int [quantNum];
			quantNum = 0;
			System.out.println("Digite um por um: ");
			while (quantNum < nums.length){
				nums[quantNum] = s.nextInt();
				quantNum++;
			}
			resul = c.somar(nums);
		}
		if (res == 2) {
			System.out.println("quantos numeros deseja subtrair?: ");
			quantNum = s.nextInt();
			nums = new int [quantNum];
			quantNum = 0;
			System.out.println("Digite um por um: ");
			while (quantNum < nums.length){
				nums[quantNum] = s.nextInt();
				quantNum++;
			}
			resul = c.subtrair(nums);
		}
		if (res == 3) {
			System.out.println("quantos numeros deseja dividir?: ");
			quantNum = s.nextInt();
			nums = new int [quantNum];
			quantNum = 0;
			System.out.println("Digite um por um: ");
			while (quantNum < nums.length){
				nums[quantNum] = s.nextInt();
				quantNum++;
			}
			resul = c.dividir(nums);
		}
		if (res == 4) {
			System.out.println("quantos numeros deseja multiplicar?: ");
			quantNum = s.nextInt();
			nums = new int [quantNum];
			quantNum = 0;
			System.out.println("Digite um por um: ");
			while (quantNum < nums.length){
				nums[quantNum] = s.nextInt();
				quantNum++;
			}
			resul = c.multiplicar(nums);
		}
		return resul;
	}

}
