package arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CriarArquivo {
	
	public static void criar(String nome) {
		
		File arq = new File(nome);
		if(arq.exists() == true) {
			System.out.println("O arquivo ja existe!");
		}else {
			try {
				arq.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void gravar(String nomeArquivo, String linha) {
		try {
			FileWriter arqu = new FileWriter(nomeArquivo, true);
			arqu.write(linha);
			arqu.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void ler(String nomeArquivo) {
		File file = new File(nomeArquivo);
		try {
			Scanner arq = new Scanner(file);
			while(arq.hasNextLine() ) {
				String linha = arq.nextLine();
				System.out.println(linha);
			}
			arq.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
;	}
	
	public static void main(String[] ags) {
		//criar arquivo de texto;
		criar("pessoas.txt");
	
		
	}
		
	}
	