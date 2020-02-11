public class Patient
{
    private String aName;
    private boolean aNotfall;
    public Patient(String pName, boolean pNotfall)
    {
        aName = pName;
        aNotfall = pNotfall;
    }

    public String getName()
    {
        return aName;
    }

    public boolean istNotfall()
    {
        return aNotfall;
    }

    public boolean equals(Patient pPatient)
    {
        return (aName.equalsIgnoreCase(pPatient.getName()) && aNotfall == pPatient.istNotfall());
    }
}
