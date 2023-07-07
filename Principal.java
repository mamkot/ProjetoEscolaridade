import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Principal {

    public static void main(String[] args) {
        int GrauEsc, fund = 0, med = 0, sup = 0, OutroFunc = 0, contador = 0;     
        String mensagem;
        do{
            GrauEsc=Integer.parseInt(JOptionPane.showInputDialog("Escolha o grau de escolaridade correspondente: \n1 - Ensino fundamental \n2 - Ensino médio \n3 - Ensino superior"));
            if (GrauEsc==1) {
                fund=fund+1;            
            }
            else {
                if (GrauEsc==2) {
                    med=med+1;               
                }
                else {
                    sup=sup+1;        
                }            
            }
            OutroFunc=Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar outro funcionário?: \n1 - Sim \n2 - Não"));
            contador++; 
       
        }while(OutroFunc==1);
        DecimalFormat df = new DecimalFormat("##.##");
        mensagem = "Total de funcionários entrevistados: "+contador
               +"\nFuncionários somente com o ensino fundamental: " + fund + "\nPercentual: " + df.format((fund*100/contador))+"%"
               +"\nFuncionários com o ensino médio completo: " + med + "\nPercentual: " + df.format((med*100/contador))+"%"
               +"\nFuncionários com o ensino superior completo: " + sup + "\nPercentual: " + df.format((sup*100/contador))+"%";                
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
}
