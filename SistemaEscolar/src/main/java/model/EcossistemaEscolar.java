package model;

import java.util.ArrayList;

public class EcossistemaEscolar {
    private ArrayList<Escola> escolas;

    public EcossistemaEscolar(ArrayList<Escola> escola) {
        this.escola = new ArrayList<>();
    }
    public void adicionarEscola(Escola escola){
     escola.add(escola);
  }
   public void removerEscola(Escola escola){
        escolas.remove(escola);
   }
}
