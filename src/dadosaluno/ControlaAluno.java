/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dadosaluno;
import cadastroalunos.CadastroAluno;
import javabean.Aluno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanP
 */
public class ControlaAluno {
    
    private ArrayList<Aluno> alunos = new ArrayList();
    
    public boolean salvarDados(Aluno alunos){
        if(matriculaIgual(alunos)){
            if(alunos != null){
                this.alunos.add(alunos);
                return true;
            }
        }
        return false;
    }
    
    public boolean salvarNa3POS(Aluno alunos){
        if(matriculaIgual(alunos)){
            if(alunos != null){
                try{
                    this.alunos.add(2, alunos);
                }catch(java.lang.IndexOutOfBoundsException e){
                    JOptionPane.showMessageDialog(null,"Não foi possível adicionar um aluno na 3º posição");
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    public boolean matriculaIgual(Aluno alunos){
        for(int i=0; i < this.alunos.size();i++){
            if(alunos.getMatricula().equals(this.alunos.get(i).getMatricula())){
                return false;
            }
        }
        return true;
    }
    
    public ArrayList<Aluno> retornarDados(){
        return alunos;
    }
}
