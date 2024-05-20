import javax.swing.JOptionPane;

public class Separador {
    public static void main(String[] args) {
        // Solicita ao usuário a entrada de dados
        String entrada = JOptionPane.showInputDialog("Digite os dados:");

        // Separa a entrada por vírgulas
        String[] elementos = entrada.split(",");

        // StringBuilder para armazenar números e strings separadamente
        StringBuilder numeros = new StringBuilder();
        StringBuilder strings = new StringBuilder();

        // Analisa cada elemento
        for (String elemento : elementos) {
            elemento = elemento.trim(); // Remove espaços em branco
            try {
                // Tenta converter o elemento para número
                Double.parseDouble(elemento);
                numeros.append(elemento).append("\n");
            } catch (NumberFormatException e) {
                // Se não for número, considera como string
                strings.append(elemento).append("\n");
            }
        }

        // Exibe os números e strings separados
        JOptionPane.showMessageDialog(null, "Números:\n" + numeros.toString() + "\nStrings:\n" + strings.toString());
    }
}

