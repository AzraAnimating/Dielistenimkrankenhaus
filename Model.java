public class Model
{
    Verwaltung aVerwaltung = null;
    //GUI_project aGui = new GUI_project(this);
    GUI_projectvonGil aGui2 = new GUI_projectvonGil(this);
    public Model(Verwaltung pVerwaltung)
    {
        aVerwaltung = pVerwaltung;
    }
    //ToDisplay

    public void patientVorhandenAusgabe(String pPatientenName){
        if(this.istPatientVorhanden(pPatientenName)){
            this.ausgabeSuche(pPatientenName, aVerwaltung.istInNotfallPatienten(pPatientenName));
            this.ausgabeVorhanden(true);
        } else {
            this.ausgabeVorhanden(false);
            this.ausgabeSuche("Name", false);
        }
    }

    public void patientNotfallAusgabe(String pPatientenName){
        if(this.istPatientNotfall(pPatientenName)){
            this.ausgabeSuche(pPatientenName, aVerwaltung.istInNotfallPatienten(pPatientenName));
            this.ausgabeVorhanden(true);
        } else {
            this.ausgabeVorhanden(false);
            this.ausgabeSuche("Name", false);
        }
    }

    public void patientNochZuBehandelnAusgabe(String pPatientenName){
        if(this.istPatientNochZuBehandeln(pPatientenName)){
            this.ausgabeSuche(pPatientenName, aVerwaltung.istInNotfallPatienten(pPatientenName));
            this.ausgabeVorhanden(true);
        } else {
            this.ausgabeVorhanden(false);
            this.ausgabeSuche("Name", false);
        }
    }


    public void ausgabeAllePatienten(String pInhalt){
        aGui2.allePatientenAusgabe(pInhalt);
    }
    public void ausgabeNochPatienten(String pInhalt){
        aGui2.nochPatientenAusgabe(pInhalt);
    }
    public void ausgabeNotPatienten(String pInhalt){
        aGui2.notPatientenAusgabe(pInhalt);
    }

    public void ausgabeSuche(String pName, boolean pNotfall)
    {
        if(pNotfall) {
            aGui2.ausgabeInfoFeld(pName, "Ja");
        } else {
            aGui2.ausgabeInfoFeld(pName, "Nein");
        }
    }

    public void ausgabeVorhanden(boolean pVorhanden){
        if(pVorhanden){
            aGui2.ausgabeVorhanden("Ja");
        } else {
            aGui2.ausgabeVorhanden("Nein");
        }
    }

    //ToController
    public void einliefern(String pName, boolean pNotfall)
    {
        aVerwaltung.einliefern(pName, pNotfall);
    }
    public void behandeln(String pPatientenName)
    {
        aVerwaltung.behandeln(pPatientenName);
    }

    public boolean istPatientVorhanden(String pPatientenName)
    {
        return aVerwaltung.istInAllePatienten(pPatientenName);
    }
    public boolean istPatientNotfall(String pPatientenName)
    {
        return aVerwaltung.istInAllePatienten(pPatientenName);
    }
    public boolean istPatientNochZuBehandeln(String pPatientenName)
    {
        return aVerwaltung.istInAllePatienten(pPatientenName);
    }

}
