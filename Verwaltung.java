import sum.werkzeuge.*;
public class Verwaltung
{
    List<Patient> aAllePatienten = new List<Patient>();
    List<Patient> aNotFaelle = new List<Patient>();
    List<Patient> aNochZuBehandeln = new List<Patient>();
    List<Patient> aBehandelt = new List<Patient>();

    Model aModel = new Model(this);
    /**
     * Construktor läd die angegebene Anzahl von Patienten in die Listen
     * und sortiert die schwerwiegenden fälle in die Liste der Notfälle ein
     */
    public Verwaltung(int lAnzahlPatienten)
    {
        Rechner lRechner = new Rechner();
        for(int i = 0; i < lAnzahlPatienten ; i++)
        {
            int lZufallsZahl = lRechner.ganzeZufallszahl(0,1);
            if(lZufallsZahl == 1)
            {
                Patient lPatient = new Patient("Patient" + i, true);
                aNotFaelle.append(lPatient);
                aAllePatienten.append(lPatient);
                aNochZuBehandeln.append(lPatient);
            }
            else
            {
                Patient lPatient = new Patient("Patient" + i, false);
                aAllePatienten.append(lPatient);
                aNochZuBehandeln.append(lPatient);
            }
        }
    }

    /**
     * Fordert die Angabe einer Liste
     * Gibt den Inhalt der angegebenen Liste in die Konsole aus
     */
    private void ausgabe(List<Patient> lPatientenListe)
    {
        lPatientenListe.toFirst();
        while(lPatientenListe.hasAccess())
        {
            System.out.println(lPatientenListe.getContent().getName() + " Notfall? " + lPatientenListe.getContent().istNotfall());
            lPatientenListe.next();
        }
    }

    /**
     * Fragt ab ob eine Liste ein bestimmten Patienten enthält
     */
    private boolean listContains(List<Patient> pListe, Patient pGesuchterPatient)
    {
        pListe.toFirst();
        boolean found = false;
        while(pListe.hasAccess() && !found)
        {
            if(pListe.getContent().getName().equals(pGesuchterPatient.getName()))
            {
                found = true;
                break;
            }
            pListe.next();
        }
        return found;
    }

    /**
     * Entfernt den angegebenen Patienten aus der angegebenen Liste
     */
    private void removeFromList(List<Patient> pListe, Patient pGesuchterPatient)
    {
        pListe.toFirst();
        while(pListe.hasAccess())
        {
            if(pListe.getContent().getName().equals(pGesuchterPatient.getName()))
            {
                pListe.remove();
                break;
            }
            pListe.next();
        }
    }

    /**
     * Gibt das objekt des Patienten zurück, der Anhand seines Namens gesucht wurde
     */
    private Patient getPatientByName(List<Patient> pList, String pName)
    {
        Patient lGefundenerPatient = null;
        pList.toFirst();
        while(pList.hasAccess())
        {
            if(pList.getContent().getName().equalsIgnoreCase(pName))
            {
                lGefundenerPatient = pList.getContent();
                break;
            }
            pList.next();
        }
        return lGefundenerPatient;
    }

    /**
     * Behandelt den angegebenen Patient, der Patient wird aus den Listen "aNochZuBehandeln" und ggf. aus "aNotfaelle" entfernt.
     */
    public void behandeln(String pPatientenName)
    {
        Patient lPatient = this.getPatientByName(aAllePatienten, pPatientenName);
        if(lPatient != null)
        {
            if(this.listContains(aAllePatienten, lPatient))
            {
                if(this.listContains(aNotFaelle, lPatient))
                {
                    this.removeFromList(aNotFaelle, lPatient);
                }
                this.removeFromList(aNochZuBehandeln, lPatient);
                aBehandelt.append(lPatient);
            }
            else
            {
                System.out.println("Dieser Patient ist nicht in unserer Datenbank vertreten");
            }
        }
        this.aktualisieren();
    }

    /**
     * Erstellt ein neues Objekt der klasse "Patienten" anhand der angegebenen Parameter und sortiert es in die korrekten Listen ein
     */
    public void einliefern(String pPatientenName, boolean pNotfall)
    {
        Patient lPatient = new Patient(pPatientenName, pNotfall);
        aAllePatienten.append(lPatient);
        aNochZuBehandeln.append(lPatient);
        if(pNotfall)
        {
            aNotFaelle.append(lPatient);
        }
        this.aktualisieren();
    }

    public boolean istInAllePatienten(String pPatientenName)
    {
        boolean lIstInListe = false;
        if(this.getPatientByName(aAllePatienten, pPatientenName) != null)
        {
            lIstInListe = this.listContains(aAllePatienten, this.getPatientByName(aAllePatienten, pPatientenName));
        }
        return lIstInListe;
    }

    public boolean istInNotfallPatienten(String pPatientenName)
    {
        boolean lIstInListe = false;
        if(this.getPatientByName(aAllePatienten, pPatientenName) != null)
        {
            lIstInListe = this.listContains(aNotFaelle, this.getPatientByName(aAllePatienten, pPatientenName));
        }
        return lIstInListe;
    }

    public boolean istInNochZuBehandeln(String pPatientenName)
    {
        boolean lIstInListe = false;
        if(this.getPatientByName(aAllePatienten, pPatientenName) != null)
        {
            lIstInListe = this.listContains(aNochZuBehandeln, this.getPatientByName(aAllePatienten, pPatientenName));
        }
        return lIstInListe;
    }

    //Modelspezifischer Teil

    private String ausgabeInterface(List<Patient> pListe)
    {
        StringBuilder lAusgabe = new StringBuilder();
        pListe.toFirst();
        while(pListe.hasAccess())
        {
            lAusgabe.append(pListe.getContent().getName()).append("\n");
            pListe.next();
        }
        return lAusgabe.toString();
    }

    private void aktualisieren(){
        aModel.ausgabeNochPatienten(this.ausgabeInterface(aNochZuBehandeln));
        aModel.ausgabeAllePatienten(this.ausgabeInterface(aAllePatienten));
        aModel.ausgabeNotPatienten(this.ausgabeInterface(aNotFaelle));
    }
}
