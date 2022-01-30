package projetoCalculoMedia;

import javax.swing.JOptionPane;

public class CalculoMedia {
	public static void main(String[] args) {
		//recebendo os dados de uma caixa de dialogo
		String nota1 = JOptionPane.showInputDialog("Informe a nota 1");	
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4");
		
		if (nota1 == null || nota1.length() == 0 || nota2 == null || nota2.length() == 0 || nota3 == null || nota3.length() == 0 || nota4 == null || nota4.length() == 0) {
			JOptionPane.showMessageDialog(null, "Uma das notas não foi digitada");
		}
		else {
			//transformando os dados de String para numeros reais para serem calculados
			double dNota1 = Double.parseDouble(nota1);
			double dNota2 = Double.parseDouble(nota2);
			double dNota3 = Double.parseDouble(nota3);
			double dNota4 = Double.parseDouble(nota4);
		
			//calculo da média das notas
			double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		
			if (media >= 50) {
				if (media >= 70) {
					//imprime o valor do calculo da média em uma caixa de dialogo
					JOptionPane.showMessageDialog(null, "Aluno está aprovado com média de: " + media);
				}
				else {
					//imprime o valor do calculo da média em uma caixa de dialogo
					JOptionPane.showMessageDialog(null, "Aluno está em recuperação com média de: " + media);
				}
			}
			else {
				//imprime o valor do calculo da média em uma caixa de dialogo
				JOptionPane.showMessageDialog(null, "Aluno está reprovado com média de: " + media);
			}
		}
	}
}
