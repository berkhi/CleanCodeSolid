package com.berkhayta._01_Solid._02_OCP._01_OCP_Aykiri;
// OCP Uygun mu Değil mi?
//
public class SekilDrawer {
    private String tip;

    public SekilDrawer(String tip) {
        this.tip = tip;
    }

    public void ciz(){
        if(tip.equals("daire")){
            daireCiz();
        }
        else if(tip.equals("kare")){
            kareCiz();
        }
        else if(tip.equals("ucgen")){
            ucgenCiz();
        }
    }

    private void ucgenCiz() {
        System.out.println("Üçgen Çizildi...");
    }

    private void kareCiz() {
        System.out.println("Kare Çizildi...");
    }

    private void daireCiz() {
        System.out.println("Daire Çizildi...");
    }
}
