import javax.swing.JOptionPane;

public class Separador {
    public static void main(String[] args) {
        
        String dados = JOptionPane.showInputDialog("Digite os dados:");

        String[] elementos = dados.split(",");

        StringBuilder numeros = new StringBuilder();
        StringBuilder strings = new StringBuilder();

        for (String elemento : elementos) {
            elemento = elemento.trim();
            try {
                Double.parseDouble(elemento);
                numeros.append(elemento).append("\n");
            } catch (NumberFormatException e) {
                strings.append(elemento).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, "Números:\n" + numeros.toString() + "\nStrings:\n" + strings.toString());
    }
}

